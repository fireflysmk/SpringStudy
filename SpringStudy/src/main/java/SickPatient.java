
public class SickPatient extends Patient {

    public static String request =  "I NEED HELP!!!";

    public SickPatient(String name, int age) {
        super(name, age);
        setRequest(this.request);
    }

}
