import java.util.Scanner;
public class four_number_max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n =sc.nextInt();
        System.out.println("Enter the second number:");
        int m = sc.nextInt();
        System.out.println("Enter the third number:");
        int o = sc.nextInt();
        System.out.println("Enter the fourth number:");
        int p = sc.nextInt();
        System.out.println(Math.max(Math.max(n, m), Math.max(o, p)));
    }
}
