import java.util.Scanner;
public class Account {
    private String name;
    private double balance;

    //creating a constructor
    public Account(String name, double balance){
        this.name = name;
        
        if(balance > 0.0)
            this.balance = balance;
    }

    //method that pass double depositAmount as parameter and return value
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    //method that return account balance
    public double getBalance(){
        return balance;
    }

    //method that set the name
    public void setName(String name){
        this.name = name;
    }

    //method that get the name
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Account account1 = new Account("Musa", 6000);
        Account account2 = new Account("Monower", 654567);

        //display initial value of object
        //account1
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        //account2
         System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

         //create a Scanner to obtain user input
         Scanner input = new Scanner(System.in);
         
    }
}
