import java.util.Scanner;
public class ShapeTester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ShapeContainer myShape = new ShapeContainer();
        int choice;
        int shape;
        choice = 0;
        shape = 0;
        while(choice != 5)
        {
            System.out.println("1- Create a shape");
            System.out.println("2- Show all the shapes");
            System.out.println("3- Show the total perimeter");
            System.out.println("4- Show the total area");
            System.out.println("5- Exit");

            System.out.println("Choose a number: ");
            choice = in.nextInt();

            if(choice == 1)
            {
                int a,b,c;
                System.out.println("1-Circle");
                System.out.println("2-Rectangle");
                System.out.println("3-Square");
                System.out.println("4-Triangle");
                System.out.println("Choose your shape: ");
                shape = in.nextInt();

                if(shape == 1)
                {
                   System.out.println("Enter the radius: ");
                   a = in.nextInt();
                   myShape.add(new Circle(a));
                }
                else if (shape == 2)
                {
                    System.out.println("Enter the width and length: ");
                    a = in.nextInt();
                    b = in.nextInt();
                    myShape.add(new Rectangle(a,b));
                }
                else if (shape == 3)
                {
                    System.out.println("Enter the side ");
                    a = in.nextInt();
                    myShape.add(new Square(a));
                }
                else
                {
                    System.out.println("Enter the sides: ");
                    a = in.nextInt();
                    b = in.nextInt();
                    c = in.nextInt();
                    myShape.add(new Triangle(a,b,c));
                }
            }
            else if(choice == 2)
            {
                System.out.println(myShape);
            }
            else if(choice == 3)
            {
                System.out.println("Total perimeter of the shapes is " + myShape.getPerimeter());
            }
            else if(choice == 4)
            {
                System.out.println("Total area of the shapes is " + myShape.getArea());
            }

        }
    }
}
