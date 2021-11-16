package P1;

import java.util.Scanner;

public class Exc01
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i= Integer.parseInt(sc.next());
        }
        catch (Exception obj)
        {
            obj.printStackTrace();
        }
    }
}
