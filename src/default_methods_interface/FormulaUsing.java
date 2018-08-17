package default_methods_interface;

import org.junit.Test;

public class FormulaUsing implements Formula {

        @Override
        public double calculate(int a) {
            return sqrt(a * 100);
        }

    @Test
    public void action (){
        System.out.println(calculate(100));
        System.out.println(sqrt(16));
    }

}
