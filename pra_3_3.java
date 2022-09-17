import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

interface p
{
    public final int R = 100;
    int multiply();
}
interface  p1 extends  p
{
    public final int R1 = 10;

    int sum();

}
interface  p2 extends  p
{
    public final int R2 = 20;

    int sub();
}

interface p12 extends  p1 , p2{
    public final int R3 = 30;
    int divide();
}
public class pra_3_3 implements  p12 {
    private int a,b;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First value = ");
         a = sc.nextInt();
        System.out.print("Enter The Second  value = ");
         b = sc.nextInt();
    }

        public int divide()
        {
            return a/b;
        }
        public  int sub()
        {
            return a - b;
        }
        public  int sum()
          {
        return a + b;
          }
         public  int multiply()
          {
        return a * b;
           }

}
