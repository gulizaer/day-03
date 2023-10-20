package day03;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        1. Create a class named EmployeeInfo.java
        2. Declare the following Variables:
           1. name
           2. age
           3. gender
           4. company_name
           5. jobTitle
           6. salary
        3. Use concatenation to display the full info of the employee:
           Ex:
             given data:
             name = “Daniel”
             age = 28
             gender = “Male”
             company_name = “Google Inc”
             job_title = ”Software Developer"
             salary = 90000
             output:
             Daniel is 28 years old, gender is Male.
             Daniel works at Google Inc as a Software Developer.
             Daniel makes $ 90000 per year
         */

        String  name = "Daniel";
        Byte age = 28;
        String  gender = "Male";
        String company_name = "Google Inc";
        String job_title = "Software Developer";
        Long salary = 90000L;

        System.out.println( name + " is " + age + " years old,gender is " + gender + ".\n"
                +  name  + " works at " +  company_name + " as a "  +  job_title
                +"\"" + "\n" + name + " makes " + "$" + salary + " per year.");

    }
}
