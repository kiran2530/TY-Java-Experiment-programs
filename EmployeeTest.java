class Employee
{
    String firstName;
    String lastName;
    double monthlySalary;

    // initialise the object using constructor.
    Employee()
    {
        firstName = "" ;
        lastName = "" ;
        monthlySalary = 0.0 ;
    }

    // Set mothods for each instance variable.
    void setFirstName(String f)
    {
        this.firstName = f ;
    }

    void setLastName(String l)
    {
        this.lastName = l ;
    }

    void setMonthlySalary(double sal)
    {
        if(sal<0)
        {
            this.monthlySalary = 0.0 ;
        }

        this.monthlySalary = sal ;
    }

    // Get mothod for each instance variable.
    String getFirstName()
    {
        return this.firstName ;
    }

    String getLastName()
    {
        return this.lastName ;
    }

    double getMonthlySalary()
    {
        return this.monthlySalary ;
    }

    double getRaisedMonthlySalary()
    {
        return (this.monthlySalary + this.monthlySalary * 10 / 100);
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee() ;
        Employee emp2 = new Employee() ;

        System.out.println("\n-------------- Details of Employee 1 -------------");
        emp1.setFirstName("Vaishnavi") ;
        emp1.setLastName("Desai") ;
        emp1.setMonthlySalary(40000.0) ;
        System.out.println("First Name      : " + emp1.getFirstName()) ;
        System.out.println("Last Name       : " + emp1.getLastName()) ;
        System.out.println("Monthly Salary  : " + emp1.getMonthlySalary()) ;
        System.out.println("Yearly Salary   : " + emp1.getMonthlySalary() * 12);

        System.out.println("\n----- Details of Employee 1 after 10% raised. -----");
        System.out.println("First Name      : " + emp1.getFirstName()) ;
        System.out.println("Last Name       : " + emp1.getLastName()) ;
        System.out.println("Monthly Salary  : " + emp1.getRaisedMonthlySalary()) ;
        System.out.println("Yearly Salary   : " + emp1.getRaisedMonthlySalary() * 12);
        
        System.out.println("**********************************************************") ;
        System.out.println("\n-------------- Details of Employee 2 -------------");
        emp2.setFirstName("Soniya") ;
        emp2.setLastName("Desai") ;
        emp2.setMonthlySalary(35000.0) ;
        System.out.println("First Name      : " + emp2.getFirstName()) ;
        System.out.println("Last Name       : " + emp2.getLastName()) ;
        System.out.println("Monthly Salary  : " + emp2.getMonthlySalary()) ;
        System.out.println("Yearly Salary   : " + emp2.getMonthlySalary() * 12);

        System.out.println("\n----- Details of Employee 2 after 10% raised. -----");
        System.out.println("First Name      : " + emp2.getFirstName()) ;
        System.out.println("Last Name       : " + emp2.getLastName()) ;
        System.out.println("Monthly Salary  : " + emp2.getRaisedMonthlySalary()) ;
        System.out.println("Yearly Salary   : " + emp2.getRaisedMonthlySalary() * 12);
    }
}