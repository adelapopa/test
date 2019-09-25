package com.timbuchalka;

public class Helicopter extends Aircraft implements Flyable{
    private WeatherTower weatherTower;

    protected Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {

    switch (){
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
    }

    @Override
    public void registerTower(WeatherTower WeatherTower) {

    }
}
