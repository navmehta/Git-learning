//Insertion sort!!
import java .util.*;
public class Insersion_sort {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a= A.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[]arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=A.nextInt();
        }
        System.out.println("The array you entered is: "+Arrays.toString(arr));
        insertion(arr);
        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
    public static void insertion(int []arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int temp= arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
