import java.util.*;
public class sum_n_numbers {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the number till where the sum you want: ");
        int a= A.nextInt();
        System.out.println("The sum is: "+sum(a));

    }

     public static int sum(int sum){
        if(sum==1){
            return 1;
        }
        return sum + sum(--sum);
    }
        }
