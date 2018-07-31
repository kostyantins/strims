package eleks_academy_java.loops;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxInDoubleArray {

    @Test
    public void minMaxInArray() {

        int[][] array = {{11, 12, 9, 14, 60}, {200, 50, 23, 19, 25}, {31, 100, 33, 34, 35}};

        int max = array[0][0];
        int min = array[0][0];
        int y = 0;
        int x = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] > max) {
                    max = array[i][k];
                    y = i;
                }

                if (array[i][k] < min) {
                    min = array[i][k];
                    x = i;
                }
            }
        }
        int minInMaxLine = array[y][0];
        for (int i = 0; i < array[y].length; i++) {
            if (array[y][i] < minInMaxLine) {
                minInMaxLine = array[y][i];
            }
        }

        int maxInMaxLine = array[x][0];
        for (int i = 0; i < array[x].length; i++) {
            if (array[y][i] > maxInMaxLine) {
                maxInMaxLine = array[x][i];
            }
        }
        System.out.println("Max value is : " + max);
        System.out.println("Max value is : " + min);
        System.out.println("Index of max value is : " + y);
        System.out.println("Index of min value is : " + x);
        System.out.println("Min value in max value's index is : " + minInMaxLine);
        System.out.println("Min value in max value's index is : " + maxInMaxLine);

    }

    @Test
    public void minMaxInArray_() {

        int[][] array = {{11, 12, 9, 14, 60}, {200, 50, 23, 19, 25}, {31, 100, 33, 34, 35}};

        int max = array[0][0];
        int min = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] > max) {
                    max = array[i][k];
                }

                if (array[i][k] < min) {
                    min = array[i][k];
                }
            }
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }

    @Test
    public void minMaxInArray__() {

        Integer[] numbers = {8, 2, 6, 7, 1, 4, 9, 5, 3};

        int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
