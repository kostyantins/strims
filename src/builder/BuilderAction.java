package builder;

public class BuilderAction {

    public static void main(String[] args) {

        Email email = new Email.Builder("blblbl", "Hi")
                .setAttachment(true)
                .setBody("Oh Hi !!")
                .setCc("_+_+_")
                .setPriority(1)
                .build();

        System.out.println(email.getBody());
        System.out.println(email.getCc());
        System.out.println(email.getPriority());
        System.out.println(email.getTo());
        System.out.println(email.getSubject());
    }
}
