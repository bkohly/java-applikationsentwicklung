public class Aufgabe12 {
    public static void main(String[] args) {
        int[] erstesArray = new int[5];
        int[] zahlen = {10, 20, 30, 40};

        for (int zahl : zahlen) {
            System.out.println(zahl);
        }


        int[] zweitesArray = new int[100];

        for (int i = 0; i < 100; i++) {
            zweitesArray[i] = i;
            System.out.println(zweitesArray[i]);
        }

        int summe = 0;
        for (int zahl : zweitesArray) {
            summe += zahl;
        }
        System.out.println(summe);

        for (int zahl : zweitesArray) {
            if (zahl % 2 == 0) {
                zahl++;
            }
            else {
                zahl--;
            }
            System.out.println(zahl);
        }
    }
}


