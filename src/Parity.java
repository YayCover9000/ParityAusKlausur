
public class Parity {
    public static void main (String [] args) {
        long wert = 1234;
        Parity.getParity(wert);
    }
    public static short getParity (long wert) {
        // long in short wandeln
        long longy = wert;
        short shorty = 0;
        String loner;
        loner = Long.toString(longy);

        System.out.println("Long to String: " + loner);
        return shorty;
    }

}
