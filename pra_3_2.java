import java.util.Scanner;


interface  IScanner {

     int sub() ;
    int sum();

}
    interface  IPrinter {
      void GetData();
    }

public class pra_3_2 implements IPrinter , IScanner {
    private int a, b;
    public void GetData()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Value First --> ");
        a=sc.nextInt();
        System.out.print("Enter The Value Second --> ");
        b=sc.nextInt();

    }
    public int sum()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }

}
