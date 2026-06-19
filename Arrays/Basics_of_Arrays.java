package Arrays;
public class Basics_of_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //how to intialize an array 
        int arr[] = {1,2,3,4,5};
        //how to print an array
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //another way to print an array
        System.out.println(arr[0]);
        //how to update values in an array
        arr[0] = 10; 
        System.out.println(arr[0]);
        //array of certain length 
        int []x= new int[5];// here we are limiting the size of an array to a length of 5 also the array would be intialized with default values of 0
        //how to take input in an array
        
        for(int i =0;i<n;i++){ //to take input in an array we can use a for loop and take input from the user using scanner class
            x[i] = sc.nextInt();
        }
    }
}
