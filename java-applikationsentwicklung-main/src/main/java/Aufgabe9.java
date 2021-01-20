import javax.swing.*;

public class Aufgabe9 {
    public static void main(String[] args) {
        int gewicht = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie ihr Gewicht ein"));
        String name = JOptionPane.showInputDialog(null, "Bitte Namen eingeben");
        double groesse = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte geben Sie Ihre Groesse in m ein"));

         System.out.println(name + "\n" + "Ihr BMI beträgt " + gewicht / Math.pow(groesse, 2));

    }
}
