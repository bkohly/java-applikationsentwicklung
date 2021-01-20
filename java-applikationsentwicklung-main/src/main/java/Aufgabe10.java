import javax.swing.*;
import java.util.Arrays;

public class Aufgabe10 {
    public static void main(String[] args) {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte erste Zahl eingeben"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte zweite Zahl eingeben"));
        String zeichen = JOptionPane.showInputDialog(null, "Bitte Operator(+, -, /, *) eingeben");

        int resultat;
        switch (zeichen) {
            case ("+"):
                resultat = zahl1 + zahl2;
                System.out.println(zahl1 + " + " + zahl2 + " ergibt " + resultat);
                break;
            case ("-"):
                resultat = zahl1 - zahl2;
                System.out.println(zahl1 + " - " + zahl2 + " ergibt " + resultat);
                break;
            case ("/"):
                resultat = zahl1 / zahl2;
                System.out.println(zahl1 + " / " + zahl2 + " ergibt " + resultat);
                break;
            case ("*"):
                resultat = zahl1 * zahl2;
                System.out.println(zahl1 + " * " + zahl2 + " ergibt " + resultat);
                break;
        }
    }

}
