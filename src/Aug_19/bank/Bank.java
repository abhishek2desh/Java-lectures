package Aug_19.bank;

import java.util.Scanner;

public class Bank {
    // deposit
    // withdraw
    // balance
    double balance;
    int age;

    String name;
    double withdraw;

    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }
    public double withdraw(double withdraw) throws InsufficientBalanceException {

        if(withdraw > balance){
            throw new InsufficientBalanceException("Insufficient balance in your account ");
        }
        balance = balance - withdraw;
        return balance;
    }

    public int setAge() throws AgeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Customer Age");
        this.age = sc.nextInt();
        if(this.age < 18){
            throw new AgeException("Age is less than legal required age.");
        }
        return this.age;
    }

    public int getAge(){
        return this.age;
    }
    public String setName() throws NameException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Customer Name");
        this.name = sc.next();
//        if(true){
//            throw new NameException("Name value not string");
//        }
        return this.name;

    }

    public String getName(){
        return this.name;
    }

}