import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Administrator {

    public Patient getPatientInfo(String name, int age) {

       // Patient patient = new SickPatient(name, age);
       // patient.setDirection(name + " :  to a dantist, 518 room");

        //Archive note = new PaperNote();
        //note.scanArchiveNotes();
        //patient.setHistory(note);


        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Patient patient  = context.getBean("patient", Patient.class);
        patient.getNote().scanArchiveNotes();

        return patient;
    }

}
