import java.util.Date;
public class Lec10Prac{
    static abstract class Employee{
        String name;
        Date dob;
        Integer salary;
        
        abstract Integer calculateSalary();
    }   
    static class OfficeEmployee extends Employee {
    Integer workDayCount;
        Integer calculateSalary(){
            return this.workDayCount*100000;
        }
    }

    static class FactoryEmployee extends Employee{
        Integer artifactCount;
        Integer calculateSalary(){
            return this.salary + artifactCount * 5000;
        }
    }

    public static void main(String[] args) {
        FactoryEmployee fe = new FactoryEmployee();
        fe.name="A";
        fe.salary=100;
        fe.dob=new Date(1990, 2, 14);
        fe.artifactCount =400;

        System.out.println(fe.calculateSalary());

        OfficeEmployee oe = new OfficeEmployee();
        oe.name="A";
        oe.salary=100;
        oe.dob=new Date(1990, 2, 14);
        oe.workDayCount=20;
        
        System.out.println(oe.calculateSalary());

    }
}


