package eleks_academy_java.serialization_deserialization_json;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Serialization {

    @Test
    public void getJsonFromMap() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");

        ObjectMapper mapper = new ObjectMapper();
        String jsonResult = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(map);

        System.out.println(jsonResult);
    }

    @Test
    public void getJsonAsObject() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");

        ObjectMapper mapper = new ObjectMapper();
        String jsonResult = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(map);

        System.out.println(jsonResult);
    }
}
