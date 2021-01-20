public class Aufgabe14 {
    public static  void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println("*");
            for (int j = 1; j <= 10; j++) {
                System.out.print(" *");
                for (int a = 1; a < j; a++) {
                    System.out.print(" ");
                }
            }
        }
    }
}

