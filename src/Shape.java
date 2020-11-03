/**
 * an abstract class contains the method of the features of the shapes
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
public abstract class Shape implements Locatable, Selectable{
    //instances
    private int x, y;
    private boolean selected;
    //methods
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract Shape contains(int x, int y);


    @Override
    public int getX()
    {
        return x;
    }
    @Override
    public int getY()
    {
        return y;
    }

    @Override
    public void setLocation(int x, int y)
    {
       this.x = x;
       this.y = y;
    }

    @Override
    public boolean getSelected()
    {
        return selected;
    }

    @Override
    public void setSelected(boolean a)
    {
       selected = a;
    }


        @Override
        public String toString()
        {
            String text = "";

                if(this instanceof Circle)
                {
                    text = "The circle having tha area: " + this.getArea() + " and the circumference: " + this.getPerimeter() + " is selected";
                }
                else if(this instanceof Square)
                {
                    text = "The square having tha area: " + this.getArea() + " and the perimeter: " + this.getPerimeter() + " is selected";
                }
                else if(this instanceof Rectangle)
                {
                    text = "The rectangle having tha area: " + this.getArea() + " and the perimeter: " + this.getPerimeter() + " is selected";
                }
                else if(this instanceof Triangle)
                {
                    text = "The triangle having tha area: " + this.getArea() + " and the perimeter: " + this.getPerimeter() + " is selected";
                }
                
            return text;
        }

}
