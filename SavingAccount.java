class SavingsAccount 
{
    static double annualInterestRate;
    private double savingBalance;
    SavingsAccount(double s) 
    {
        this.savingBalance = s;
    }
    double calculateMonthlyInterest() 
    {
        savingBalance += (savingBalance*((annualInterestRate/100)/12));
        return this.savingBalance;
    }
    public static void modifyInterestRate(double n)
    {
        annualInterestRate = n;
    }
}

public class SavingAccount
{
    public static void main(String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        System.out.println("\n--------------- currunt balance of Saver 1 and Saver 2-----------------------");
        System.out.println("Saver 1 : " + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 : " + saver2.calculateMonthlyInterest());

        System.out.println("\n----------- balance of Saver 1 and Saver 2 after raising the interest to 4% --------------");
        SavingsAccount.modifyInterestRate(4.0);
        System.out.println("Saver 1 : " + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 : " + saver2.calculateMonthlyInterest());

        System.out.println("\n----------- balance of Saver 1 and Saver 2 after raising the interest to 5% --------------");
        SavingsAccount.modifyInterestRate(5.0);
        System.out.println("Saver 1 : " + saver1.calculateMonthlyInterest());
        System.out.println("Saver 2 : " + saver2.calculateMonthlyInterest());
    }
}
