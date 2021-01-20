package common;

public class StringExtensions<quersumme> {

    public static void main(String[] args) {
        String text = "Hallo Welt!";
        System.out.println("reversed: " + reverse(text));


        String zahl = "12345";
        System.out.println(quersum(zahl)); // Quersumme
    }

    static public String reverse(String text) {
        String reversed = "";
        char[] ausgabe = text.toCharArray();
        for (int i = 0; i < ausgabe.length; i++) {
            reversed = reversed + String.valueOf(ausgabe[ausgabe.length - i - 1]);
        }
        return reversed;
    }

    static public int quersum(String value) {
        int quersumme = 0;
        for (int i = 0; i < value.length(); i++) {
            quersumme = quersumme + value.charAt(i) - 48;
        }
        return quersumme;
    }
}


