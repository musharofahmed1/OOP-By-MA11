import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args){
        //create Scanner
        Scanner input = new Scanner(System.in);

        //create a object named myAccount
        Account myAccount = new Account();

        
        //using getName() for null 
        System.out.printf("Initial Name is: %s%n%n", myAccount.getName());

        System.out.printf("Enter Name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.println(myAccount.getName());
         
    }
}
