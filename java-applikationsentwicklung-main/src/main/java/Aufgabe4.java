public class Aufgabe4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String text = Integer.toString(i);
            System.out.print("\n" + text + "-er Reihe: ");
            for (int j = 1; j <= 10; j++) {
                String ausgabe = Integer.toString(j * i);
                System.out.print( " " + ausgabe );
            }
        }
    }
}