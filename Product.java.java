import java.util.Scanner;

public class Product{
    
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);

    int x;
    int y;
    int z;
    int result;
  
    System.out.println("Enter first integer: ");
    x = input.nextInt();

    System.out.println("Enter second integer: ");
    y = input.nextInt();

    System.out.println("Enter third integer: ");
    z = input.nextInt();
  
    result = x * y * z;

    System.out.printf("Product is %d", result);

    }

}