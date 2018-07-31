package eleks_academy_java.loops;


import org.junit.Test;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatedInArray {


    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(4);

        System.out.println(hasDuplicates(numbersList));

    }


    public static boolean hasDuplicates(List<Integer> numbersList) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < numbersList.size(); i++) {
            numberSet.add(numbersList.get(i));
        }
        if (numberSet.size() < numbersList.size()) {
            return true;
        } else {
            return false;
        }
    }
}
