public class Square extends Rectangle {
    private double side;

    public Square(int side)
    {
        super(side,side);
        this.side = side;
    }

    @Override
    public double getArea()
    {
        double area;
        area = side * side;
        return area;
    }

    
}
