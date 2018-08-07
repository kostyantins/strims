package singleton;

public class EmailSingleton {

    private static EmailSingleton INSTANCE = new EmailSingleton();

    protected EmailSingleton() {};

    public static EmailSingleton getInstance() {
        return INSTANCE;
    }

    public void sentEmail (String emailInfo) {
        System.out.println("Was sent: " + emailInfo);
    }
}
