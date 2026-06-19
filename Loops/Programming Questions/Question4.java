//if cost price and selling pric of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred.
import java.util.Scanner.*;
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price of the item: ");
        System.out.println("Enter the selling price of the item:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a>b){
            System.out.println("It is a loss of " + (a-b));
        }else if(a==b){
            System.out.println("No profit no loss");
        }else   
        {
            System.out.println("It is a profit of " + (b-a));
        }
    }
}
    

