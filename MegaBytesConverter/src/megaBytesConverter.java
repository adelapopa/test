public class megaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(4000);
        printMegaBytesAndKiloBytes(2560);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("invalid value");
        } else {
            int megaBytes;
            int remainingKilobytes;
            megaBytes = kiloBytes / 1024;
            remainingKilobytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB" + remainingKilobytes );

        }
    }
}
