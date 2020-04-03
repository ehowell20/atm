import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        // number of transactions gone by
        int transaction = 0;
        // response to atm question
        String answer = "G";
        // deposit/withdraw/transfer credit value
        int value = 0;
        Scanner kb = new Scanner(System.in);
        // creates checking account with default balance
        CheckingAccount checking = new CheckingAccount();
        // creates savings account with default balance
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Hi! How may I help you?");
        // loops the machine options until user quits
        do
        {
            System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            answer = kb.nextLine();
            if (answer.equalsIgnoreCase("D"))
            {
                // deposit
                System.out.print("Deposit to: (1)Checking or (2)Savings?");
                value = kb.nextInt();
                if (value == 1)
                {
                    // deposit into checking
                    System.out.println("How many credits do you want to deposit?");
                }
                else
                {
                    System.out.println("How many credits do you want to deposit?");
                }
            }
            else if (answer.equalsIgnoreCase("W"))
            {
                // withdraw
            }
            else if (answer.equalsIgnoreCase("C"))
            {
                // check balance
                System.out.println("Your checking account has " + checking.getBalance() + " credits");
                System.out.println("Your savings account has " + savings.getBalance() + " credits");
            }
            else if (answer.equalsIgnoreCase("T"))
            {
                // transfer
            }
            transaction++;
        }
        while (!answer.equals("q") && !answer.equals("Q"));
    }
}