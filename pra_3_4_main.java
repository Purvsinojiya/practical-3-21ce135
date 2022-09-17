import java.util.Scanner;

public class pra_3_4_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First value = ");
       int  a = sc.nextInt();
        System.out.print("Enter The Second  value = ");
      int   b = sc.nextInt();

      pra_3_4 p4 = new pra_3_4();
      p4.sample1(a,b);

        child c4 = new child();
        c4.sample1(a,b);

    }
}
