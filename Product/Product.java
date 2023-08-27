import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        //create Scanner 
        Scanner input = new Scanner(System.in);

        int x,y,z,result;
        System.out.printf("Enter First Integer: ");
        x = input.nextInt(); // read first integer

        System.out.printf("Enter Second Integer:");
        y = input.nextInt();

        System.out.printf("Enter Third Integer: ");
        z = input.nextInt();

        //calculating result
        result = x * y * z;

        System.out.printf("Product Of x X y X z = %d", result);
    }
    
}
