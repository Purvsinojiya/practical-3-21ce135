public class pra_3_4 {
    void sample1(int a , int b)
    {
        System.out.println("In Parent class method ");
        System.out.println("a+b ="+ (a+b));
    }
}
class child extends pra_3_4
{
    void sample1(int a , int b)
    {
        System.out.println("In child class method ");
        System.out.println("a-b =" + (a-b));

    }
}

