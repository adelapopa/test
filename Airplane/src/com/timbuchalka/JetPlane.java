package com.timbuchalka;

public class JetPlane extends Aircraft implements Flyable{

    private WeatherTower weatherTower;
    protected JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {


        switch () {
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
    }

    @Override
    public void registerTower(WeatherTower WeatherTower) {

    }
}
