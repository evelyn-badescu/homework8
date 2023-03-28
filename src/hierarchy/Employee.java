package hierarchy;

import java.util.Date;

public abstract class Employee implements Person{

    protected String position;
    protected Date dateOfEmployment;

    protected String name;
    protected String lastname;

    public Employee(String position, String name, String lastname) {
        this.position = position;
        this.name = name;
        this.lastname = lastname;
    }

    protected String address;

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastname;
    }

    public Date getBirthday(){
        return null;
    }

   public abstract String getFullName();




    @Override
    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }


}
