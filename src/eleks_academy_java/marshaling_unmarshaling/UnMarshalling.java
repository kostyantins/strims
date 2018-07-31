package eleks_academy_java.marshaling_unmarshaling;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnMarshalling {

    public static void main(String[] args) {

        try {
            File file = new File("customer.xml");

            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Customer customer = (Customer) unmarshaller.unmarshal(file);
            System.out.println(customer.getName());

        } catch (JAXBException ex) {
            Logger
                    .getLogger(UnMarshalling.class.getName())
                    .log(Level.SEVERE, "Something was wrong with unmarshalling !!", ex);
        }
    }

}
