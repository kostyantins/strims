package eleks_academy_java.loops;


import org.junit.Test;

import java.util.Arrays;

public class Fibonacci {

    @Test
    public void fibonacci (){

        int length = 10;
        long[] series = new long[length];
        series[0] = 0;
        series[1] = 1;
        for (int i = 2; i < length; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        System.out.print(Arrays.toString(series));
    }
}
