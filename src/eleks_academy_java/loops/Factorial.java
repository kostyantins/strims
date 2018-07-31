package eleks_academy_java.loops;


import org.junit.Test;

public class Factorial {

    @Deprecated
    public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    @Test
    public void getFac(){
        getFactorial(10);
    }

    @Test
    public int factorial_(int n) {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    //з рекурсією
    public int factorial__(int n)
    {
        if (n == 0) return 1;
        return n * factorial_(n-1);
    }
}
