package eleks_academy_java;

import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CollectionsException {

    @Test
    public void throwException() throws SQLException {

        List<Integer> numberList = new ArrayList<>();

        if (numberList.isEmpty()) {
            throw new NullPointerException("Collection is NULL !!");
        }

        numberList
                .forEach(System.out::println);
    }

    @Test
    public void catchException() {

        int a = 5;
        int b = getNumber();
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException");
            b = 1;
        }

        c = a / b;

        System.out.println(c);
    }


    private int getNumber() {
        return 0;
    }

}