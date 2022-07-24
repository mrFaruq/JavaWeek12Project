package contructors;

public class Employee {
    public String name, jobTitle;
    public Integer ID;
    public double salary;               // instance variable, belongs to Object
    public static String companyName;   //static field belongs to Class

    static {
        companyName = "Microsoft";  // this value is same for all the objects of this class
    }

    public Employee() {
        salary = 10000;     //when I create an Employee object with default constructor
    }

    public Employee(String name, String jobTitle, Integer ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", company Name="+companyName +
                '}';
    }
}
/*
Task 1:
Employee:
    attribute/fields/variables
    name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will print out the fields

 */
