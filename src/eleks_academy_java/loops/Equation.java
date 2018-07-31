package eleks_academy_java.loops;


public class Equation {

    public static void main(String[] args) {

        int a = 1;
        int b = -2;
        int c = 0;

        solveEquation(a, b, c);
    }

    public static void solveEquation(int a, int b, int c){
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }else {
            if (discriminant == 0){
                double x = -b / 2 * a;
                System.out.println("x = " + x);
            }else{
                System.out.println("The equation has no solutions");
            }
        }
    }
}
