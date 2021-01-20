public class Point {

    static int x;
    static int y;


    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }

    static int getX() {
        return Point.x;
    }
    static int getY() {
        return Point.y;
    }
    static void setX(int x){
        Point.x = x;
    }
    static void setY(int y){
        Point.y = y;
    }
}