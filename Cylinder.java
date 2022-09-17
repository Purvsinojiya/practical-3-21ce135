public class Cylinder {
    private double rad=1, hei=1;

    Cylinder() {}

    Cylinder(double a)
    {
        rad=a;
    }

    Cylinder(double a, double b)
    {
        rad=a;
        hei=b;
    }

    void getArea()
    {
        double ans;
        ans=2*3.14*rad*(rad+hei);
        System.out.println("Area of the Cylinder is "+ans);
    }
}
