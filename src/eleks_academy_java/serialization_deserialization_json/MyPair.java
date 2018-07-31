package eleks_academy_java.serialization_deserialization_json;


public class MyPair {

    public String first;
    public String second;

    public MyPair() {
    }

    public MyPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "MyPair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}

