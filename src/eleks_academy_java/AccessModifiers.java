package eleks_academy_java;


public class AccessModifiers {

           int one = 10;

    public int two = 10;

    protected double three = 30.55;

    private String fore = "fore";

    public String getFore() {
        return fore;
    }

    public void setFore(String fore) {
        this.fore = fore;
    }

    public void printName () {};

    private String getName () {
        System.out.println("string");
        return "";
    };
}
