package eleks_academy_java.loops;


import java.util.HashMap;
import java.util.Map;

public class MapWordOccurrence {

    public static void main(String[] args) {

        String text = "My name is Alex Alex is is ";
        System.out.println(getMapWordOccurrence(text));

    }


    public static Map getMapWordOccurrence(String text) {

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String wordA : text.split(" ")) {
            int numberOfOccurrence = 0;
            for (String wordB : text.split(" ")) {
                if (wordA.equals(wordB)) {
                    numberOfOccurrence++;
                }
            }
            wordsMap.put(wordA, numberOfOccurrence);
        }
        return wordsMap;
    }
}
