package functional_interface.reference_on_object;


import org.junit.Test;

public class PersonAction {

    //Person::new - this is reference on construktor
    PersonFactory<Person> personFactory = Person::new;

    @Test
    public void action () {
     Person person = personFactory.create("Peter", "Parker");
        System.out.println(person.firstName + " " + person.lastName);
    }
}
