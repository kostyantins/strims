package eleks_academy_java.loops;


public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(getSquareRoot(4));
    }

    public static double getSquareRoot(int number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            throw new RuntimeException();
        }
    }
}
