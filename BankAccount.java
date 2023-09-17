import java.util.ArrayList;
import java.util.Scanner;

class PasswordMismatchException extends Exception {
    PasswordMismatchException(String s) {
        super(s);
    }
}

class LowBalanceException extends Exception {
    LowBalanceException(String s) {
        super(s);
    }
}

class NegetiveNumberException extends Exception {
    NegetiveNumberException(String s) {
        super(s);
    }
}

public class BankAccount {
    String name;
    int accNO;
    String password;
    double balance = 0.0;

    static boolean flag = true;
    static ArrayList<BankAccount> AccountInfo = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    BankAccount() {
        sc.nextLine();
        System.out.print("ENTER FULL NAME : ");
        this.name = sc.nextLine();
        System.out.print("ENTER ACCOUNT NO : ");
        this.accNO = sc.nextInt();
        System.out.print("ENTER PASSWORD : ");
        this.password = sc.next();
    }
    public static int checkAccountNo(int acc_no) {
        for(int i =0; i<AccountInfo.size(); i++) {
            if(AccountInfo.get(i).accNO == acc_no) {
                flag = false;
                return i;
            }
        }
        return -1;
    }
    // Balance Enquery...
    public void balanceEnquery(String pass)throws PasswordMismatchException {
        if(this.password.equals(pass)) {
            System.out.print("BALANCE : " + this.balance + " \n");
        }
        else {
            throw new PasswordMismatchException("Error!... Incorrect Password...");
        }
    }
    // Withdraw...
    public void withdraw(String pass)throws PasswordMismatchException,LowBalanceException,NegetiveNumberException {
        if(!this.password.equals(pass))
            throw new PasswordMismatchException("Error!... Incorrect Password...");
        int amount;
        System.out.print("ENTER AMOUNT : ");
        amount = sc.nextInt();
        if(amount < 0)
            throw new NegetiveNumberException("Error!... Invalid Amount...");
        if(amount > this.balance)
            throw new LowBalanceException("Insufficient Balance...");
        this.balance -= amount;
        System.out.println(amount + " WITHDRAW SUCCESSFULLY FROM ACCOUNT NUMBER " + this.accNO);
        System.out.println("BALANCE : " + this.balance);
    }
    // Transfer...
    public void transfer(String pass)throws PasswordMismatchException,LowBalanceException,NegetiveNumberException {
        if(!this.password.equals(pass))
            throw new PasswordMismatchException("Error!... Incorrect Password...");
        
        int acc_no;
        BankAccount saver2 = null;
        System.out.print("ENTER ACCOUNT NUMBER OF RECEIVER : ");
        acc_no = sc.nextInt();
        int check = checkAccountNo(acc_no);
        if(check != -1) {
            saver2 = AccountInfo.get(check);
        }
        else {
            System.out.println("ACCOUNT NOT FOUND...");
            return;
        }

        int amount;
        System.out.print("ENTER AMOUNT : ");
        amount = sc.nextInt();
        if(amount < 0)
            throw new NegetiveNumberException("Error!... Invalid Amount...");
        if(amount > this.balance)
            throw new LowBalanceException("Insufficient Balance...");
        
        saver2.balance += amount;
        this.balance -= amount;

        System.out.println(amount + " TRANSFER SUCCESSFULLY FROM ACCOUNT NUMBER " + this.accNO + " TO " + saver2.accNO);
        System.out.println("BALANCE : " + this.balance);
    }
    // Deposit...
    public void deposit(String pass)throws PasswordMismatchException,NegetiveNumberException{
        if(!this.password.equals(pass))
            throw new PasswordMismatchException("Error!... Incorrect Password...");

        int amount;
        System.out.print("ENTER AMOUNT : ");
        amount = sc.nextInt();
        if(amount < 0)
            throw new NegetiveNumberException("Error!... Invalid Amount...");
        this.balance += amount;
        System.out.println(amount + " DEPOSIT SUCCESSFULLY IN ACCOUNT NUMBER " + this.accNO);
        System.out.println("BALANCE : " + this.balance);
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("\n---------- MENU ----------");
            System.out.println("1. CREATE NEW ACCOUNT. \n2. EXISTING ACCOUNT. \n3. EXIT.");
            System.out.println("--------------------------\n");
            System.out.print("ENTER CHOICE : ");
            ch = sc.nextInt();
            switch(ch) {
                case 1 :
                    BankAccount saver = new BankAccount();
                    AccountInfo.add(saver);
                    break;
                case 2 :
                    if(AccountInfo.size() == 0) {
                        System.out.println("THERE ARE 0 ACCOUNT BANK....");
                        break;
                    }
                    BankAccount saver1 = null;
                    int check;
                    
                    int acc_no;
                    System.out.print("ENTER ACCOUNT NUMBER : ");
                    acc_no = sc.nextInt();
                    check = checkAccountNo(acc_no);
                    if(check != -1) {
                        saver1 = AccountInfo.get(check);
                        System.out.println("---------- WEL-COME ----------");
                        System.out.println(" NAME : " + saver1.name);
                        System.out.println("ACCOUNT NO :  " + saver1.accNO);
                        System.out.println("------------------------------\n");
                    }
                    else {
                        System.out.println("ACCOUNT NOT FOUND...");
                        break;
                    }

                    int ch1;
                    do {
                        System.out.println("---------- " + saver1.name + " ----------");
                        System.out.println("1. BALANCE ENQUERY. \n2. WITHDRAW. \n3. TRANSFER. \n4. DEPOSIT. \n5. EXIT. ");
                        System.out.println("---------------------------------------\n");
                        System.out.print("ENTER CHOICE : ");
                        ch1 = sc.nextInt();
                        String pass;
                        switch(ch1) {
                            case 1 : 
                                System.out.print("ENTER PASSWORD : ");
                                pass = sc.next();
                                try {
                                    saver1.balanceEnquery(pass);
                                }
                                catch(PasswordMismatchException e) {
                                    System.out.println(e);
                                }
                            break;

                            case 2 :
                                System.out.print("ENTER PASSWORD : ");
                                pass = sc.next();
                                try {
                                    saver1.withdraw(pass);
                                }
                                catch(PasswordMismatchException e) {
                                    System.out.println(e);
                                }
                                catch(NegetiveNumberException e) {
                                    System.out.println(e);
                                }
                                catch(LowBalanceException e) {
                                    System.out.println(e);
                                }
                            break;

                            case 3 :
                                System.out.print("ENTER PASSWORD : ");
                                pass = sc.next();
                                try {
                                    saver1.transfer(pass);
                                }
                                catch (PasswordMismatchException e) {
                                    System.out.println(e);
                                }
                                catch(NegetiveNumberException e) {
                                    System.out.println(e);
                                }
                                catch(LowBalanceException e) {
                                    System.out.println(e);
                                }
                            break;

                            case 4 :
                                System.out.print("ENTER PASSWORD : ");
                                pass = sc.next();
                                try {
                                    saver1.deposit(pass);
                                }
                                catch (PasswordMismatchException e) {
                                    System.out.println(e);
                                }
                                catch(NegetiveNumberException e) {
                                    System.out.println(e);
                                }
                            break;
                            
                            case 5 :
                            break;

                            default :
                                System.out.println("PLEASE ENTER VALID CHOICE BETWEEN 1-5...");
                        }
                    }while(ch1 != 5);
                break;

                case 3 :
                    System.out.println("THANK YOU!...");
                    System.exit(0);
                break;

                default : 
                    System.out.println("PLEASE ENTER VALID CHOICE BETWEEN 1-3...");
            }
        }while(ch != 3);
    }
}