package functional_interface.reference_on_object;


public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);
}
