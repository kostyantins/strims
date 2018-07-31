package eleks_academy_java.serialization_deserialization_object;

//The class must implement the java.io.Serializable interface.
//All of the fields in the class must be serializable. If a field is not serializable, it must be marked transient.
//Static variables also can be serialized
public class Employee implements java.io.Serializable {

    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public Employee() {
    }

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSSN() {
        return SSN;
    }

    public int getNumber() {
        return number;
    }
}
