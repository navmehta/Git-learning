import java.util.*;
public class Natural_number {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        System.out.print("Enter the term: ");
        int a= A.nextInt();
        System.out.println("The sum is: "+ num(a));

    }
    public static int num(int a){
        if(a==0){
            return 0;
        }
        return a + num(--a);
    }
}
