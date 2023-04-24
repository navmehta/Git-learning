//Binary search
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a= A.nextInt();
        System.out.print("Enter the sorted array: ");
        int[]arr=new int[a];       //Array declaration!!
        for(int i=0;i<arr.length;i++){   //for loop for the input of the array!!
            arr[i]=A.nextInt();
        }
        System.out.println("The Input array is: "+Arrays.toString(arr));  //printing the array!!
        System.out.println("Enter the element you want to find: ");
        int x= A.nextInt();  //Input for the element to be found.
        if(binary(arr,x)==-1){
            System.out.println("Element not found: ");
        }
        else{
            System.out.println("Element found at " +(binary(arr,x)+1)+" position");
        }
    }
    //Function foe the Binary search
    public static int binary(int arr[],int x){
        int left=0;
        int right=arr.length-1;
        int mid;
        while (left <= right){
             mid = (left + right) / 2;
             if (arr[mid] == x) {
                return (mid);
            }
            else if(x>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
