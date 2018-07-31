package eleks_academy_java.comparator;


import java.util.TreeSet;

public class ComparatorPresentation {

    public static void main(String[] args) {

        PersonNameComparator personNameComparator = new PersonNameComparator();
        TreeSet<Person> people = new TreeSet<>(personNameComparator);

        people.add(new Person("Tom", 25, 1000));
        people.add(new Person("Nick", 20, 500));
        people.add(new Person("Alice",31, 2000));
        people.add(new Person("Bill", 35, 5000));

        people.forEach(System.out::println);


        System.out.println("===================================");


        PersonSalaryComparator personSalaryComparator = new PersonSalaryComparator();
        TreeSet<Person> people_ = new TreeSet<>(personSalaryComparator);

        people_.add(new Person("Tom", 25, 1000));
        people_.add(new Person("Nick", 20, 500));
        people_.add(new Person("Alice",31, 2000));
        people_.add(new Person("Bill", 35, 5000));

        people_.forEach(System.out::println);
    }
}
