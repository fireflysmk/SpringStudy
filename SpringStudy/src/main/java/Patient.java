import org.springframework.beans.factory.annotation.Autowired;

public class Patient {

    public String name;
    public int age;
    public String request;
    public String direction;
    public Archive history;
    public PaperNote note;

    public PaperNote getNote() {
        return note;
    }

    public void setNote(PaperNote note) {
        this.note = note;
    }



    public void setHistory(Archive history) {
        this.history = history;
    }

    public String getDirection() {
        System.out.println(this.direction);
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setRequest(String request) {
        this.request = request;
    }


    public Patient() {
        System.out.println("new Pation");
    }

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.age + "  ." + this.request );
    }



}
