//find the product of the elements in the array
package Arrays;

public class Question3 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int product =1;
        for (int i = 0;i<arr.length;i++){
            product = product * arr[i];
        }
        System.out.println(product);
    }
}
