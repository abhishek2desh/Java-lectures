package Aug_19.bank;

import java.util.Scanner;
enum payment{
    Debit,
    Credit,
    Interac
};
public class BankMain {
    public static void main(String[] args) throws InsufficientBalanceException, AgeException, NameException {
        Bank bank = new Bank();
        double deposit = bank.deposit(1000);

        System.out.println("Deposit amount is "+ deposit);

        double withdraw = bank.withdraw(2000);

        System.out.println("Balance withdraw amount is "+ withdraw);

        System.out.println("Enter the age of the customer");
        bank.setAge();
        bank.setName();
        payment myVar = payment.Debit;
        switch(myVar) {
            case Debit:
                System.out.println("Debit Payment");
                break;
            case Credit:
                System.out.println("Credit Payment");
                break;
            case Interac:
                System.out.println("Intarac Payment");
                break;
        }

    }
}