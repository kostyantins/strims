package eleks_academy_java.serialization_deserialization_json;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eleks_academy_java.serialization_deserialization_object.Employee;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Test;

import java.io.*;

public class MyPairSerializer {

    private OutputStream outStream;
    private InputStream inStream = null;
    private JsonWriter writer;
    private JsonReader reader;

    //using json_io
    @Test
    public void SerializePair() {
        try {
            MyPair pair = new MyPair("Mila", "Sui");
            System.out.println("Writing to pair-out.json");
            File file = new File("pair-out.json");
            outStream = new FileOutputStream(file);
            writer = new JsonWriter(outStream);
            writer.write(pair);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //using jackson-databind
    @Test
    public void deSerializePairWithGson() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        MyPair myPair = objectMapper.readValue(new File("pair-out.json"), MyPair.class);
        System.out.println(myPair);
        System.out.println(myPair.getFirst() + " " + myPair.getSecond());
    }

    //using jackson-databind Object to JSON in file
    @Test
    public void serializePairWithGson() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        MyPair myPair = new MyPair("Mila", "Sui");

        //Object to JSON in file
        mapper.writeValue(new File("pair_out_02.json"), myPair);
    }

    //using jackson-databind Object to JSON in String
    @Test
    public void serializePairWithGson_() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        MyPair myPair = new MyPair("Mila", "Sui");

        //Object to JSON in String
        String jsonInString = mapper.writeValueAsString(myPair);

        System.out.println(jsonInString);
    }

    @Test
    public void deserializePairWithGson_() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Employee employee = new Employee("Mila", "Ukraine", 1112226, 1);
        mapper.writeValue(new File("employ_out.json"), employee);
    }

    @Test
    public void serializePairWithGson__() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(new File("employ_out.json"), Employee.class);
        System.out.println(employee);
    }
}
