package eleks_academy_java.serialization_deserialization_object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String [] args) {

        Employee employee = null;
        try(FileInputStream fileIn = new FileInputStream("src/eleks_academy_java/serialization_deserialization_object/employee.ser")) {
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
            System.out.printf("Deserialize data is saved in src/eleks_academy_java/serialization_deserialization_object/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("SSN: " + employee.getSSN());
        System.out.println("Number: " + employee.getNumber());
    }
}
