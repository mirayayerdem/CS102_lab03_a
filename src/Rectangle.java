/**
 * a class specify the features of the rectangle
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
public class Rectangle extends Shape {
    //instances
    private int width;
    private int height;

    //constructor
    public Rectangle (int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    /**
     * a method to calculate the area of the rectangle
     * @return area of the rectangle
     */
    public double getArea()
    {
        double area;
        area = width * height;
        return area;
    }
    /**
     * a method to calculate the perimeter of the rectangle
     * @return the perimeter of the rectangle
     */
    public double getPerimeter()
    {
        double perim;
        perim = 2 * (width + height);
        return perim;
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
        if( x >= getX() && x <= getX() + width && y <= getY() && y >= getY() - height) //check the point if it is in interval or not
            return this;
        return null;
    }
}
