//Given an array print negative elements only.
package Arrays;
import java.util.Scanner;
public class Questtion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i =0;i<n;i++){ //we are taking input in an array using a for loop and scanner class
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
