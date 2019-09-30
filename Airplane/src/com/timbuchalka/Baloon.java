package com.timbuchalka;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

     Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weatherOnCoordinates = weatherTower.getWeather(this.coordinates);

        switch (weatherOnCoordinates){
            case "RAIN":
                this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight()-5);
                break;
            case "FOG":
                this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 3);
                break;
            case "SUN":
                this.coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude(), coordinates.getHeight() + 4);
                break;
            case "SNOW":
                this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 15);
                break;
            default:
                break;
        }
        Main.writer.println(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "):  " + weatherOnCoordinates);

        if (this.coordinates.getHeight() == 0) {
            Main.writer.println(this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + "): landing.");
            this.weatherTower.unregister(this);
            Main.writer.println("Tower says: " + this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
        }
    }

    @Override
    public void registerTower(WeatherTower WeatherTower) {
        this.weatherTower = weatherTower;
//        this.weatherTower.register(this);
        Main.writer.println("Tower says: " + this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
    }
