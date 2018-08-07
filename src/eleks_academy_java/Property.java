package eleks_academy_java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

    Properties properties;

    @Test
    public void createProperties() throws IOException {
        properties = new Properties();
        FileOutputStream fileOutputStream = new FileOutputStream("config.properties");
        properties.store(fileOutputStream, "Numbers configuration"); //add just comment

        fileOutputStream.close();
    }

    @Test
    public void writeProperties() throws IOException {
        properties = new Properties();
        properties.setProperty("one", "1");
        properties.setProperty("two", "2");
        properties.setProperty("three", "3");
        FileOutputStream fileOutputStream = new FileOutputStream("config.properties");
        properties.store(fileOutputStream, "Numbers configuration");

        fileOutputStream.close();
    }

    @Test
    public void readProperties() throws IOException {
        properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("two", "Property by current key is not found"));
        System.out.println(properties.getProperty("", "Property by current key is not found"));

        fileInputStream.close();
    }
}
