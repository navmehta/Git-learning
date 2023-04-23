//Selection sort
import java.util.*;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a= A.nextInt();
        System.out.println("Enter the elements of the array");
        int[]arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=A.nextInt();
        }
        System.out.println("The array you entered is: "+Arrays.toString(arr));
        selection(arr);
        System.out.println("The sorted array is: "+Arrays.toString(arr));

        }

    public static void selection(int[] arr ){
        int a=arr.length;
        for(int i=0;i<a-1;i++){
            int small=i;
            for(int j=i+1;j<a;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
}
