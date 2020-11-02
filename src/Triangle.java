public class Triangle extends Shape {
    private double s1;
    private double s2;
    private double s3;
    public Triangle(int a, int b, int c)
    {
       this.s1 = a;
       this.s2 = b;
       this.s3 = c;
    }
    @Override
    public double getArea()
    {
        double area;
        double u ;
        u = (s1 + s2 + s3) / 2;
        area = Math.sqrt(u * (u - s1) * (u - s2) * (u - s3));
        return area;

    }
    @Override
    public double getPerimeter()
    {
        double perim;
        perim = s1 + s2 + s3;
        return perim;
    }
}
