
public class HealthyPatient extends Patient {

    public static String request =  "I`m here for medical examination";

    public HealthyPatient(String name, int age) {
        super(name, age);
        setRequest(this.request);
    }
}
