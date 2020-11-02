public class Circle extends Shape {
    private double radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI * (radius * 2);
        return area;
    }
    @Override
    public double getPerimeter()
    {
        double circumfer;
        circumfer = 2 * Math.PI * radius;
        return circumfer;
    }
}
