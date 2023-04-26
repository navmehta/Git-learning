import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int a= A.nextInt();
        int remander;
        int r=0;
        System.out.println("The reversed number is: "+reverse(a));
    }
    public static int reverse(int a){
        if(a==0) {
            return 0;
        }
       int remander= a%10;
         int r = 10 + remander;
        return reverse(a/10);
    }
}
/*public class Main
{
public static void Reverse(int num)
    {
        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }
        else {
            // print the unit digit of the given number
            System.out.print(num % 10);
            // calling function for remaining number other than unit digit
            Reverse(num / 10);
        }
    }

    // driver code
    public static void main(String args[])
    {
        // number to be reversed
        int num = 1099;

        System.out.print("Reversed Number: ");
        // calling recursive function to print the number in reversed form
        Reverse(num);
    }
}*/