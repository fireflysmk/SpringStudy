import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Registry {

    public static void main(String[] args) {

        Administrator administrator = new Administrator();

        Patient patient = administrator.getPatientInfo("Vasyan", 25);
       // patient.getDirection();


       // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       // Patient patient2 = context.getBean("patient", Archive.class);

        /*
        Patient patient = administrator.getPatientInfo("Vasyan", 25);
        Patient patient2 = administrator.getPatientInfo("Anton", 35);

        patient.getDirection();
        patient2.getDirection();
        */

    }
}
