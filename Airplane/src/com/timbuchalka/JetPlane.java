package com.timbuchalka;

public class JetPlane extends Aircraft implements Flyable{

    private WeatherTower weatherTower;
     JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weatherOnCoordinates = weatherTower.getWeather(this.coordinates);

        switch (weatherOnCoordinates) {
            case "RAIN":
                this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 5, coordinates.getHeight());
                break;
            case "FOG":
                this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 1, coordinates.getHeight());
                break;
            case "SUN":
                this.coordinates = new Coordinates(coordinates.getLongitude() , coordinates.getLatitude() + 10 ,coordinates.getHeight() + 2);
                break;
            case "SNOW":
                this.coordinates = new Coordinates(coordinates.getLongitude() , coordinates.getLatitude(), coordinates.getHeight()-7);
                break;
            default:
                break;
        }
        Main.writer.println(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): got " + weatherOnCoordinates + "ified seriously.");

        if (this.coordinates.getHeight() == 0) {
            Main.writer.println(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): landing.");
            this.weatherTower.unregister(this);
            Main.writer.println("Tower says: " + this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
        }
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.register(this);
        Main.writer.println("Tower says: " + this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
}
