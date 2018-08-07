package eleks_academy_java.serialization_deserialization_object;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

        public static void main(String [] args) {
            Employee employee = new Employee();
            employee.setName("Vasilko");
            employee.setAddress("Nezalegnosty str., Ukraine");
            employee.setSSN(11122333);
            employee.setNumber(101);

            try (FileOutputStream fileOut = new FileOutputStream("src/eleks_academy_java/serialization_deserialization_object/employee.ser")) {
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(employee);
                out.close();
                fileOut.close();
                System.out.printf("Serialized data is saved in src/eleks_academy_java/serialization_deserialization_object/employee.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
    }

