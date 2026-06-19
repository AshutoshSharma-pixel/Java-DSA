import java.util.Scanner;
public class Star_Rectangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        for(int i = 0;i<=n;i++){
            for (int j = 1;j<=m;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
