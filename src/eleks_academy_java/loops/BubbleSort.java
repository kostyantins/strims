package eleks_academy_java.loops;


import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

    @Test
    public void bubbleSort() {

        int[] numArray = {3, 2, 11, 5, 9, 1};

        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        IntStream stream = Arrays.stream(numArray);
        stream.forEach(System.out::println);

    }
}
