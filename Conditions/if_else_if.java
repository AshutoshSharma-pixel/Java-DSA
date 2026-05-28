import java.util.Scanner;
public class if_else_if {
    Public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
       if(a>b){
        System.out.println("the first number is greater than second number");
       }else if (a==b){
        System.out.println("the two numbers are equal");   
       }else{
        System.out.println("the second number is greater than first number");
       }
    }
    
}
