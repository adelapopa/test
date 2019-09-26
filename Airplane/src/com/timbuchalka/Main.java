package com.timbuchalka;

import java.io.*;

public class Main {
    static PrintWriter writer;
    static int var;

    public static void main(String[] args) {
	AircraftFactory aircraftFactory = new AircraftFactory();
	WeatherTower weatherTower = new WeatherTower();

	try{
	    if(args.length<1) {
	        throw new IOException();
        }
	    String inputFile = args[0];
        File outputFile = new File("simulation.txt");
        writer = new PrintWriter(outputFile);
        if(outputFile.exists()){
            writer.print("");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
        String nextLine;
        int line = 0;

        while((nextLine = reader.readLine()) != null){
            if(line == 0) {
                var = (Integer.parseInt(String.valueOf(nextLine)));
                if(var < 0) {
                    throw new IOException();
                } }else {
                    String[] currentLine = nextLine.split(" ");
                    if(currentLine.length == 5)
                        aircraftFactory.newAircraft(currentLine[0], currentLine[1], Integer.parseInt(currentLine[2]), Integer.parseInt(currentLine[3]), Integer.parseInt(currentLine[4])).registerTower(weatherTower);
                    else {
                        throw new  IOException();
                    }
                }
                line++;

            }
            reader.close();
        
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Problema");
        exit(1);
    }
	WeatherProvider weatherProvider = WeatherProvider.getProvider();
	while (var --> 0) weatherTower.changeWeather();
    }

    private static void exit(int i) {
    }
}
