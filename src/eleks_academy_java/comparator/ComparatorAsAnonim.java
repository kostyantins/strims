package eleks_academy_java.comparator;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAsAnonim {

    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    @Test
    public void action() {

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b); //from a to z
                //return b.compareTo(a); //from z to a
            }
        });

        System.out.println(names);
    }

    @Test
    public void actionWithLambda() {

        //classic Lambda
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        //same in one line #1
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        //same in one line #2
        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println(names);
    }
}
