import javax.swing.*;

public class Aufgabe6 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Bitte Namen eingeben");

        if (name .equals("Yanik")){
            System.out.println("Das bin ich");
        }
        else {
            System.out.println("Das bin nicht ich!");
        }
    }
}

