package eleks_academy_java.loops;


public class SimpleNumbers {

    public static void main(String[] args) {

        System.out.println(isSimpleNumber(4));
    }


    public static boolean isSimpleNumber(int number) {
        for (int i = 2; i < number; i++){
            if ((number % i == 0) && (number != 2)){
                return false;
            }
        }
        return true;
    }
}
