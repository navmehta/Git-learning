/* Ceiling: Ceiling means in a sorted array using binary search we find
   the target element or the element which just greater than that!!*/
import java.util.*;
public class Ceiling {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = A.nextInt(); //Input of the size of the array!!
        int[] arr = new int[a];  //Declaration of the array!!
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) { //For loof for the input of the array!!
            arr[i] = A.nextInt();
        }
        System.out.println("The input array is: " + Arrays.toString(arr));//Printing the array!!
        System.out.println("Enter the element you want to search: ");
        int x = A.nextInt();
        if(binary(arr,x)==x){
            System.out.println("Element found at "+ (binary(arr,x)+1)+ "position");
        }
        else{
            System.out.println("Number just greater than that is "+binary(arr,x));
        }
    }

    //Function for Binary search!!
    public static int binary(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            else if(x>arr[mid]){
                left= mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return arr[left];
    }

}

