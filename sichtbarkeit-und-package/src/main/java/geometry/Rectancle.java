package geometry;

    public class Rectancle {
        public static void main(String[] args) {
            calculateArea(4, 5);
            calculateCircumference(4,5);

            System.out.println("Fläche: " + calculateArea(4, 5));
            System.out.println("Umfang: " + calculateCircumference(4,5));


        }

        public static double calculateArea(double width, double height) {
            return  width * height;

        }

        public static double calculateCircumference(double width, double height){
            return (width + height) * 2;
        }
    }


