import java.util.Scanner;
public class BankingApplication
{
    public static void main(String args[])
    {
     BankAccount ba=new BankAccount("Shrishti Singh","1001");
     ba.showMenu();
    }
}
class BankAccount
{
    String customerName;
    String customerId;
    int balance;
    int previousTransaction;
    
    BankAccount(String cname, String cid)
    {
        customerName=cname;
        customerId=cid;
    }
    
    void deposit(int amount)
    {
        if(amount!=0)
        {
            balance=balance+amount;
            previousTransaction=amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount!=0)
        {
            balance=balance-amount;
            previousTransaction=-amount;
        }
    }
    void getPreviousTransaction()
    {
        if(previousTransaction>0)
        {
            System.out.println("Deposited:"+previousTransaction);
        }
        else if(previousTransaction<0)
        {
            System.out.println("Withdrawn:"+Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }
    void showMenu()
    {
        char option='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A.Check Balance");
        System.out.println("B.Deposit");
        System.out.println("C.Withdraw");
        System.out.println("D.previousTransaction");
        System.out.println("E.Exit");
        
        do
        {
            System.out.println("------------------------------------");
            System.out.println("Enter an option");
            System.out.println("------------------------------------");
            option=sc.next().charAt(0);
            System.out.println("\n");
            
            switch(option)
            {
                
                case 'A':
                 System.out.println("---------------------------------");
                 System.out.println("Balance= "+balance);
                 System.out.println("---------------------------------");
                 System.out.println("\n");
                 break;
                
                case 'B':
                 System.out.println("---------------------------------");
                 System.out.println("Enter an amount to deposit");
                 System.out.println("---------------------------------");
                 int amount=sc.nextInt();
                 deposit(amount);
                 System.out.println("\n");
                 break;
                
                case 'C':
                 System.out.println("---------------------------------");
                 System.out.println("Enter an amount to withdraw:");
                 System.out.println("---------------------------------");
                 int amount2=sc.nextInt();
                 withdraw(amount2);
                 System.out.println("\n");
                 break;
                
                case 'D':
                 System.out.println("---------------------------------");
                 getPreviousTransaction();
                 System.out.println("---------------------------------");
                 System.out.println("\n");
                 break;
                
                case 'E':
                 System.out.println("***********");
                 break;
                
                default:
                 System.out.println("Invalid option!!...Please enter again ");
                 break;
            }
        }
        while(option!='E');
        {
            System.out.println("Thankyou for using our services");
        }
    }
    
}
