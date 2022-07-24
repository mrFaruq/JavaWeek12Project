package contructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {
        Employee employeeOne = new Employee(); //calling for default constructor

        System.out.println(employeeOne); //Employee{name='null', jobTitle='null', ID=null, salary=10000.0, company Name=Microsoft}
        employeeOne.name = "Ersin";
        employeeOne.ID = 100;
        employeeOne.jobTitle = "Technical Manager";

        Employee employeeTwo = new Employee("Efe", "QA Lead", 200, 110000 );

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employeeOne);
        team.add(employeeTwo);

        team.add(new Employee("Jamal", "SDET", 300, 95000));

        double maxSalary = Double.MIN_VALUE;
        for (Employee each : team) {
            if (each.salary>maxSalary){
                maxSalary = each.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

        for (Employee each : team) {
            if (each.name.equalsIgnoreCase("jamal")){
                System.out.println(each.jobTitle);
            }
        }
/*
Note: You can change or call static field through object or className, but second one maybe preferable
 */


        // employeeOne.companyName = "Tesla";
        Employee.companyName = "Tesla";

        // company name for each employee
        for (Employee each : team) {
            System.out.println(each.name+" is working for " + each.companyName);
        }



    }





}
