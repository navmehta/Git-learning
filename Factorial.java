import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.print("Enter the number till where the factorial you want: ");
        int a=A.nextInt();
        System.out.println("The factorial is: "+fact(a));
    }
    public static int fact(int a){
        if(a==1){
            return 1;
        }
        return a * fact(a-1);
    }
}
