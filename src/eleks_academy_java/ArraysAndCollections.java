package eleks_academy_java;


import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysAndCollections {

    int[] myList;

    @Test
    public void mapExample() {

        int[] numbers = new int[3];

        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 10;

        Set numbersSet = new HashSet();

        numbersSet.add(2);
        numbersSet.add(5);
        numbersSet.add(10);


        Map<Integer, String> applesMap = new HashMap<>();

        applesMap.put(1, "greenApple");
        applesMap.put(2, "yellowApple");
        applesMap.put(3, "readApple");

        for (Map.Entry<Integer, String> entry : applesMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {

        String[] apples = {"greenApple", "yellowApple", "readApple"};

        Stream applesStream = Arrays.stream(apples);

        applesStream.forEach(System.out::println);

        List applesList = new ArrayList(3);

        applesList.add("greenApple");
        applesList.add("yellowApple");
        applesList.add("readApple");

        applesList.remove(1);

        applesList.forEach(System.out::println);

        Map<Integer, String> applesMap = new HashMap<>();

        applesMap.put(1, "greenApple");
        applesMap.put(2, "yellowApple");
        applesMap.put(3, "readApple");

        for (Map.Entry entry : applesMap.entrySet()) {
            System.out.println(entry);
        }

        applesMap
                .entrySet()
                .stream()
                .forEach(System.out::println);

        Set numbersSet = new HashSet();

        numbersSet.add(2);
        numbersSet.add(5);
        numbersSet.add(10);

        numbersSet.forEach(System.out::println);


//        List<Integer> applesList_ = new ArrayList(3);
//
//        applesList_.add("greenApple");
//        applesList_.add(1);
//        applesList_.add(10.00);
//
//        applesList_.forEach(System.out::println);
    }

    @Test
    public void array(){

        int[] numbers = new int[3];

        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 10;

        List list = Arrays.asList(numbers);

        System.out.println(list.size());


    }

}
