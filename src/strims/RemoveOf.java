package strims;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;

public class RemoveOf {

    class Person {
        private String name;
        private int age;
        private String male;

        public Person(String name, int age, String male) {
            this.name = name;
            this.age = age;
            this.male = male;
        }
    }

    List<Person> person = new ArrayList<>();

    @Test
    public void removeOf() {
        person.add(new Person("Jon", 25, "m"));
        person.add(new Person("Mike", 30, "f"));

        //filtered the collection
        person
                .removeIf(person -> person.age > 25);

        //find smt by some goal
        person
                .stream() //use parallelStream if U need
                .filter(person -> person.male == "m")
                .mapToInt(person -> person.age);

        //sort collections by name
        person
                .sort(Comparator.comparing(person -> person.name));
        //same
//        person
//                .sort(Comparator.comparing(Person::name));
    }

    @Test
    public void removeOfCasual() {
//        person.add(new Person("Jon", 25, "m"));
//        person.add(new Person("Mike", 30, "f"));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        //filtered the collection
        for (Integer number : new ArrayList<>(numbers)) {
            if (number > 25) {
                numbers.remove(number);
            }
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }

        //filtered the collection using streams
//        List<Integer> filteredList =
//                numbers
//                        .stream()
//                        .filter(i -> i >= 30)
//                        .collect(Collectors.toList());
        //lambda
//        numbers.removeIf(i -> i > 25);
//
//        numbers.forEach(System.out::println);
    }

    @Test
    public void comparationWithLiambda() {



    }

    @Test
    public void methodReferences() {
        List<String> stringList = new ArrayList<>();
        stringList.add("arkinston");

        //replace all with upper case
        stringList.replaceAll(person -> person.toUpperCase());
        //same..
        stringList.replaceAll(String::toUpperCase);

        stringList.forEach(System.out::println);

        List<String> list = new ArrayList<>();
        for (String string : stringList) {
            list.add(string.toUpperCase());
        }

        list.forEach(System.out::println);


    }
}
