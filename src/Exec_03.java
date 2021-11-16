import java.util.InputMismatchException;
import java.util.Scanner;

public class Exec_03
{
    public static void main(String[] args) {
        int a,b,index,arr[]={12,23,34,45,56,67};
        try(Scanner sc= new Scanner(System.in))
        {
            a= sc.nextInt();
            b=sc.nextInt();
            index=sc.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch (ArithmeticException|ArrayIndexOutOfBoundsException| InputMismatchException obj)
        {
            System.out.println(obj.getClass().getName());
        }
    }
}
