package hierarchy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Programmer();
        Employee employee1=new DatabaseAdmin();
        System.out.println(employee.getPosition());
        System.out.println(employee.getFullName());
        System.out.println(employee1.getFullName());


    }
}
