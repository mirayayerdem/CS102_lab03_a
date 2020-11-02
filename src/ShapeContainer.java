import java.util.ArrayList;

public class ShapeContainer {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeContainer()
    {

    }
    public void add(Shape s)
    {
        shapes.add(s);
    }
    public double getArea()
    {
        double totalArea = 0;
        for(int i = 0 ; i < shapes.size() ; i++)
        {
            totalArea = shapes.get(i).getArea() + totalArea;
        }
        return totalArea;
    }
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
                text = text + "The area of the circle is " + shapes.get(i).getArea() + "and the circumference of the circle is " + shapes.get(i).getPerimeter() +"\n";
            }
            else if(shapes.get(i) instanceof Square)
            {
                text = text + "The area of the square is " + shapes.get(i).getArea() + "and the perimeter of the square is " + shapes.get(i).getPerimeter()+ "\n";
            }
            else if(shapes.get(i) instanceof Rectangle)
            {
                text = text + "The area of the rectangle is " + shapes.get(i).getArea() + "and the perimeter of the rectangle is " + shapes.get(i).getPerimeter() +"\n";
            }
            else if(shapes.get(i) instanceof Triangle)
            {
                text = text + "The area of the triangle is " + shapes.get(i).getArea() + "and the perimeter of the triangle is " + shapes.get(i).getPerimeter() +"\n";
            }


        }
        return text;
    }
}
