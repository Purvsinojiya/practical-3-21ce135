import java.sql.SQLOutput;
import java.util.Vector;

public class pra_3_2_main {
    public static void main(String[] args) {
        Vector<pra_3_2> v = new Vector<pra_3_2>(2);

        for (int i = 0; i < 2; i++) {
            pra_3_2 p1 = new pra_3_2();
            v.add(p1);
        }
        for (int i = 0; i < 2; i++)
        {
            System.out.println(" answer for Index = "+ i+1);
            v.get(i).GetData();
            System.out.println("Sum = " +  v.get(i).sum());
            System.out.println("Sub = " +  v.get(i).sub());
        }
    }
}

