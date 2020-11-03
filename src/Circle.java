/**
 * a class specify the features of the circle
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
public class Circle extends Shape {
    //instances
    private double radius;
    //constructor
    public Circle(int radius)
    {
        this.radius = radius;
    }

    /**
     * a method to find the area
     * @return area of the circle
     */
    @Override
    public double getArea() {
        double area;
        area = Math.PI * (radius * radius); //find the area of the circle
        return area;
    }
    /**
     * a method to find the circumference
     * @return circumference of the circle
     */
    @Override
    public double getPerimeter()
    {
        double circumfer;
        circumfer = 2 * Math.PI * radius; //find the perimeter of the circle
        return circumfer;
    }

    /**
     * a method to test the point whether is in the shape or not
     * @param x the point of the x
     * @param y the point of the y
     * @return Object if the point is in it
     */
    @Override
    public Shape contains(int x, int y)
    {
        if(x >= getX() - radius && x <= getX() + radius && y >= getY() - radius && y <= getY() + radius )
            return this;
        return null;
    }
}
