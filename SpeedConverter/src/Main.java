public class Main {
    public static void main(String[] args) {
       long miles = SpeedConverter.toMilesPerHour(30.6);
        System.out.println("miles = " + miles);

        SpeedConverter.printConversion(30);
    }
}
