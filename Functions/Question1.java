import java.util.Scanner;
public class Question1 {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        System.out.println("Enter the second number:");
        int m = sc.nextInt();
        System.out.println("Enter the third number:");
        int o = sc.nextInt();
        System.out.println(Math.max(Math.max(n, m), o));
    }
}
