package hierarchy;

public class Programmer extends Employee{
    private String language;

    @Override
    public String getPosition() {
        return position;
    }

    public Programmer() {
        super("programmer","Pitt","Brad");

    }

    public String getFullName(){
        return name+" "+lastname;
    }
}
