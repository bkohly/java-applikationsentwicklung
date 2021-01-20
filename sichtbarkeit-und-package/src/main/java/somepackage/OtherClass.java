package somepackage;
public class OtherClass {

    public static String text = "hi";

    public static void say(){
        System.out.println(text);
    }
     static String getText() {
        return text;
    }
    public static String setText(String i) {
        text = i;
        return text;
    }
} 