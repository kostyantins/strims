package functional_interface.reference_on_method;

@FunctionalInterface //not necessary
public interface Converter<F, T> {

    T convert(F from);

    default int convert_(F from){
        return 5;
    }
}
