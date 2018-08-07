package singleton;


public class SingletonAction {

    public static void main(String[] args) {
        EmailSingleton.getInstance().sentEmail("Good by!!");
    }
}
