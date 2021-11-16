import java.lang.InterruptedException;
public class Exec02
{
    public void m1() throws InterruptedException{
        m2();
    }
    public void m2() throws InterruptedException{
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        Exec02 obj=new Exec02();
        obj.m1();
        System.out.println("End of the main Method");
    }
}
