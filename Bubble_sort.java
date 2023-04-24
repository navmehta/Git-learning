//Bubble sort!!
import java.util.*;
public class Bubble_sort {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int a= A.nextInt();
        System.out.println("Enter your unsorted array: ");
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=A.nextInt();
        }
        System.out.println("The array you entred is: "+Arrays.toString(arr));
        bubble(arr,a);
        System.out.println("The sorted array is "+Arrays.toString(arr));
    }
    public static void bubble(int arr[], int a){
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //SWAP
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
