package functional_interface.reference_on_method;


import org.junit.Test;

public class ConvertAction {

    //same but with static reference on method "::"
    // Converter<String, Integer> converter = Integer::valueOf;

    @Test
    public void action (){
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
    }

    @Test
    public void action_02 (){
        final int number = 1;
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from + number);
        Integer converted = converter.convert("2");
        System.out.println(converted);    // 3
    }

}
