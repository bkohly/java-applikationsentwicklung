import java.util.Arrays;
import java.util.Random;

public class IntArrayExtensions {

    public static void main(String[] args) {
        int[] tenRandomNumber = getRandomNumbersInRange(10, 0, 9);
        System.out.println("Zufällige Zahlen: " + Arrays.toString(tenRandomNumber));
        System.out.println("Kleinster Wert: " + getMin(tenRandomNumber));
        System.out.println("Grösster Wert: " + getMax(tenRandomNumber));
        System.out.println("Durchschnitt: " + getAverage(tenRandomNumber));
        System.out.println("rückwärts: " + Arrays.toString(reverse(tenRandomNumber)));
        System.out.println("sortiert: " + Arrays.toString(sort(tenRandomNumber)));
        System.out.println("sortiert und rückwärts: " + Arrays.toString(reverse(sort(tenRandomNumber))));
        System.out.println("sortiert und wieder gemischt: " + Arrays.toString(mix(sort(tenRandomNumber))));
    }

    /**
     * Creates an array with random number.
     * @param size The size of the array.
     * @param min The smallest possible generated number.
     * @param max The biggest possible generated number.
     * @return the generated int array.
     */
    static int[] getRandomNumbersInRange(int size, int min, int max){
        Random random = new Random();
        return random.ints(size, min, max).toArray();
    }
    static int getMax(int[] elements) {
        int max = 0;
        for (int element : elements){
            if (element > max){
                max = element;
            }
        }
        return max;
    }
    static int getMin(int[] elements) {
        int min = 0;
        for (int element : elements){
            if (element <= min){
                min = element;
            }
        }
        return min;
    }
    static double getAverage(int[] elements) {
        double average = 0;
        for (int element : elements){
            average += element;
        }
        average /= elements.length;

        return average;
    }
    static int[] sort(int[] elements) {
        boolean sort = true;

        while (sort){
            sort = false;
            for ( int i = 0; i < elements.length -1; i++){
                if (elements[i] > elements[i + 1]){
                    int element1 = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i] = element1;

                }
            }

        }
        return elements;
    }
    static int[] reverse(int[] elements) {
        int j = 0;
        int[] zahlen = new int[elements.length];
        for( int i = elements.length-1; i >= 0; i--){
            zahlen[j] = elements[i];
            j++;
        }
        return zahlen;
    }
    static int[] mix(int[] elements) {
            int[] mix = new int[elements.length];
            for (int element : elements) {
                int x;
                do {
                    x = (int) Math.round(Math.random() * (elements.length-1));
                } while (mix[x] != 0 && element != 0);
                mix[x] = element;
            }
            return mix;
    }
}
