
public class Parity {
    public static void main (String [] args) {
        long wert = 22225555;
        Parity.getParity(wert);
    }

    public static short getParity (long wert){
        long longy = wert;
        short shorty = 0;
        int oddcount = 0;
        int evencount = 0;
        String loner;
        loner = Long.toString(longy);
        // System.out.println("\nLong to String: " + loner);

        for (int i = 0; i < loner.length(); i++) {
            char digit =  loner.charAt(i);
            //System.out.println("\n" + digit);
            if(digit % 2 == 0){
                evencount++;
                // System.out.println(" even ");
            } else {
                oddcount++;
                // System.out.println(" odd ");
            }
        }

        if (oddcount > evencount) {
            shorty = -1;
            System.out.println("\nMore odd numbers. Shorty is: " + shorty);
        } else if (oddcount < evencount){
            shorty = 1;
            System.out.println("\nMore even numbers. Shorty is: " + shorty);
        } else if (oddcount == evencount){
            shorty = 0;
            System.out.println("\nEqually even and odd numbers. Shorty is: " + shorty);
        }
        return shorty;
    }

}
