//print the maximum element in the array
package Arrays;

public class Question4 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int max = arr[0];
        for (int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
