package eleks_academy_java.marshaling_unmarshaling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Marshalling {

    public static void main(String[] args) throws JAXBException {

        Customer customer = new Customer(1, 30, "Markus Donald");

        try {
            File file = new File("customer.xml");

            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customer, file);
            marshaller.marshal(customer, System.out);

        } catch (JAXBException ex) {
            Logger
                    .getLogger(Marshalling.class.getName())
                    .log(Level.SEVERE, "Something was wrong with marshalling !!", ex);
        }
    }
}
