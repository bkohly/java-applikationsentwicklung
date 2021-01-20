package app;

import geometry.Rectancle;

public class RectancleApp {
    public static void main(String[] args) {
        Rectancle.calculateArea(4, 5);
        Rectancle.calculateCircumference(4,5);

        System.out.println("Fläche: " + Rectancle.calculateArea(4, 5));
        System.out.println("Umfang: " + Rectancle.calculateCircumference(4,5));


    }
}
