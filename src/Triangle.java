/**
 * a class specify the features of the triangle
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
public class Triangle extends Shape {
    private int s1;
    private int s2;
    private int s3;
    public Triangle(int a, int b, int c)
    {
       this.s1 = a;
       this.s2 = b;
       this.s3 = c;
    }

    /**
     * a method to get the triangle area
     * @return area of the triangle
     */
    @Override
    public double getArea()
    {
        double area;
        double u ;
        u = (s1 + s2 + s3) / 2.0;
        area = Math.sqrt(u * (u - s1) * (u - s2) * (u - s3));
        return area;

    }

    /**
     * a method to calculate the perimeter of the triangle
     * @return perim of the triangle
     */
    @Override
    public double getPerimeter()
    {
        double perim;
        perim = s1 + s2 + s3;
        return perim;
    }
    /**
     * a method to test the point whether is in the shape or not
     * @param x the point of the x
     * @param y the point of the y
     * @return Object if the point is in it
     */
    @Override
    public Shape contains(int x, int y) {
        int longSide = 0;
        if (s1 > longSide)
            longSide = s1;
        if (s2 > longSide)
            longSide = s2;
        if (s3 > longSide)
            longSide = s3;

        if (Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2) <= Math.pow(longSide, 2)) {
            return this;
        }
        return null;

    }
}
