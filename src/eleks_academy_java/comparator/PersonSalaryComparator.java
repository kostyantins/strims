package eleks_academy_java.comparator;


import java.util.Comparator;

public class PersonSalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        if(a.getSalary()> b.getSalary())
            return 1;
        else if(a.getSalary()< b.getSalary())
            return -1;
        else
            return 0;
    }

    @Override
    public Comparator<Person> reversed() {
        return null;
    }
}
