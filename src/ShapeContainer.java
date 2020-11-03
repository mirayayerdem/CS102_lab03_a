/**
 * a class to store all the shapes and calculate their features
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
import java.util.ArrayList;

public class ShapeContainer {
    public ArrayList<Shape> shapes;

    public ShapeContainer()
    {
        shapes = new ArrayList<Shape>();
    }
    /**
     * a method to add the shapes to arraylist
     */
    public void add(Shape s)
    {
        shapes.add(s);
    }

    /**
     * a method to get the total area of the shapes
     * @return totalArea of the shapes
     */
    public double getArea()
    {
        double totalArea = 0;
        for(int i = 0 ; i < shapes.size() ; i++)
        {
            totalArea = shapes.get(i).getArea() + totalArea;
        }
        return totalArea;
    }
    /**
     * a method to calculate the perimeter of the rectangle
     * @return totalPerim of the all shapes
     */
    public double getPerimeter()
    {
        double totalPerim = 0;
        for(int i = 0 ; i < shapes.size() ; i++)
        {
            totalPerim = shapes.get(i).getPerimeter() + totalPerim;
        }
        return totalPerim;

    }

    @Override
    public String toString()
    {
        String text = "";
        for(int i = 0 ; i < shapes.size() ; i++)
        {
            if(shapes.get(i) instanceof Circle)
            {
                text = text + "The area of the circle is " + shapes.get(i).getArea() + " and the circumference of the circle is " + shapes.get(i).getPerimeter() +"\n";
            }
            else if(shapes.get(i) instanceof Square)
            {
                text = text + "The area of the square is " + shapes.get(i).getArea() + " and the perimeter of the square is " + shapes.get(i).getPerimeter()+ "\n";
            }
            else if(shapes.get(i) instanceof Rectangle)
            {
                text = text + "The area of the rectangle is " + shapes.get(i).getArea() + " and the perimeter of the rectangle is " + shapes.get(i).getPerimeter() +"\n";
            }
            else if(shapes.get(i) instanceof Triangle)
            {
                text = text + "The area of the triangle is " + shapes.get(i).getArea() + " and the perimeter of the triangle is " + shapes.get(i).getPerimeter() +"\n";
            }


        }
        return text;
    }

    /**
     * a method to select the shape or not according to the points
     * @param x given x coordinate
     * @param y given y coordinate
     * @return object which is selected
     */
    public Object selectTheShape(int x, int y)
    {
        for(int i = 0 ; i < shapes.size() ; i++)
        {
            if(shapes.get(i).contains(x,y) != null)
            {
                shapes.get(i).setSelected(true);
                return shapes.get(i);
            }
        }
        return null;
    }
}
