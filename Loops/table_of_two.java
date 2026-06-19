//print the table of 2 by taking the number of terms as input from the user.
package Loops;
import java.util.Scanner;
public class table_of_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in the table of 2:");
        int n = sc.nextInt();
        for (int i = 1; i< 11; i++){
            System.out.println(i*n);

        }
        }
    }
