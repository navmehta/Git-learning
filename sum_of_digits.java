import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.print("Enter the number whose digit sum you want: ");
        int a= A.nextInt();
        System.out.println("The digit sum is: "+digit(a));
        System.out.println("The digit multiplication is: "+mul(a));
    }
    public static int digit(int a){
        if(a==0){
            return 0;
        }
        return (a%10) + digit(a/10);
    }
    public static int mul(int a){
        if(a==0){
            return 1;
        }
        return (a%10) * mul(a/10);
    }
}
