import java.util.*;
public class factorial1 {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a= A.nextInt();
        System.out.println("The factorial is: "+factorial(a));
    }
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        return a * factorial(a-1);
    }
}
