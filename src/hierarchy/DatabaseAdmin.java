package hierarchy;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    @Override
    public String getAddress() {
        return address+"db admin";
    }

    public DatabaseAdmin() {
        super("db admin", "Radu", "Johnson");

    }

    public String getFullName(){
        return name +" "+ lastname;
    }
}
