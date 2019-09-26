package com.timbuchalka;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height) {
        this.longitude = (longitude > 0)  ? longitude : 0; /** setare longitudine curenta */
        this.latitude = (latitude > 0 ) ? latitude : 0; /** setare latitudine curenta*/
        this.height = (height > 0 && height <= 100) ? height : (height < 0) ? 0 : 100;
        /** daca inaltimea este intre 0 si 100 returneaza inaltimea curenta
         daca este mai mica decat 0, o mentine pe 0, altfel o mentine pe 100 */
    }

    public int getLongitude() { // returnare longitudine

        return this.longitude;
    }

    public int getLatitude() { //returnare latitudine

        return this.latitude;
    }

    public int getHeight() { // returnare inaltime

        return this.height;
    }
}
