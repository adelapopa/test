package com.timbuchalka;

public class Helicopter extends Aircraft implements Flyable{
    private WeatherTower weatherTower;

     Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
    String weatherOnCoordinates = weatherTower.getWeather(this.coordinates);

    switch (weatherOnCoordinates){
        case "RAIN":
            this.coordinates = new Coordinates(coordinates.getLongitude()+5, coordinates.getLatitude(), coordinates.getHeight());
            break;
        case "FOG":
            this.coordinates = new Coordinates(coordinates.getLongitude()+1, coordinates.getLatitude(), coordinates.getHeight());
            break;
        case "SUN":
            this.coordinates = new Coordinates(coordinates.getLongitude()+ 10, coordinates.getLatitude(), coordinates.getHeight()+2);
            break;
        case "SNOW":
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight()-12);
            break;
        default:
            break;
    }
        Main.writer.println(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): it's  " + weatherOnCoordinates );

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
