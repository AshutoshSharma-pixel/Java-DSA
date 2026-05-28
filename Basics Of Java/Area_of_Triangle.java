import java.util.Scanner;
public class Area_of_Triangle {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of the traingle:");
    double b = sc.nextDouble();
    System.out.println("Enter the height of the traingle:");
    double h = sc.nextDouble();
    double area = 0.5 * b * h;
    System.out.println("Area of the triangle is :" + area);
}
}
