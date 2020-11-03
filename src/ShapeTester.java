/**
 * a class to create and modify shapes according to user
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
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
        int x;
        int y;
        while(choice < 7 && choice >= 0) //menu options
        {
            System.out.println("1- Create a shape");
            System.out.println("2- Show all the shapes");
            System.out.println("3- Show the total perimeter");
            System.out.println("4- Show the total area");
            System.out.println("5- Show the first selected shape");
            System.out.println("6- Remove the all selected shapes");
            System.out.println("7- Exit");

            System.out.println("Choose a number: ");
            choice = in.nextInt();

            if(choice == 1) //create a shape
            {
                int a,b,c;
                int x1, y1;
                System.out.println("Enter x , y coordinates of the shape: ");
                x1 = in.nextInt();
                y1 = in.nextInt();
                System.out.println("1-Circle");
                System.out.println("2-Rectangle");
                System.out.println("3-Square");
                System.out.println("4-Triangle");
                System.out.println("Choose your shape: ");
                shape = in.nextInt();

                if(shape == 1) //for circle
                {
                   System.out.println("Enter the radius: ");
                   a = in.nextInt();
                   myShape.add(new Circle(a));
                   myShape.shapes.get(myShape.shapes.size() - 1).setLocation(x1,y1);
                   System.out.println("The circle has been created!");
                }
                else if (shape == 2) //for rectangle
                {
                    System.out.println("Enter the width and length: ");
                    a = in.nextInt();
                    b = in.nextInt();
                    myShape.add(new Rectangle(a,b));
                    myShape.shapes.get(myShape.shapes.size() - 1).setLocation(x1,y1);
                    System.out.println("The rectangle has been created!");
                }
                else if (shape == 3) //for square
                {
                    System.out.println("Enter the side ");
                    a = in.nextInt();
                    myShape.add(new Square(a));
                    myShape.shapes.get(myShape.shapes.size() - 1).setLocation(x1,y1);
                    System.out.println("The square has been created!");
                }
                else //for triangle
                {
                    System.out.println("Enter the sides: ");
                    a = in.nextInt();
                    b = in.nextInt();
                    c = in.nextInt();
                    myShape.add(new Triangle(a,b,c));
                    myShape.shapes.get(myShape.shapes.size() - 1).setLocation(x1,y1);
                    System.out.println("The triangle has been created!");
                }
            }
            else if(choice == 2) //for printing out all the shapes
            {
                System.out.println(myShape);
            }
            else if(choice == 3) //for printing out all of the total perimeter
            {
                System.out.println("Total perimeter of the shapes is " + myShape.getPerimeter());
            }
            else if(choice == 4) //for printing
            {
                System.out.println("Total area of the shapes is " + myShape.getArea());
            }
            else if(choice == 5)
            {
                System.out.println("Choose x and y coordinate to be tested : ");
                x = in.nextInt();
                y = in.nextInt();
                if(myShape.selectTheShape(x,y) != null)
                System.out.println(myShape.selectTheShape(x,y).toString());
            }
            else if(choice == 6)
            {
                System.out.println("Choose x and y coordinate: ");
                x = in.nextInt();
                y = in.nextInt();

               for(int i = 0 ; i < myShape.shapes.size();i++)
               {
                   if(myShape.shapes.get(i) == myShape.selectTheShape(x,y)) //specify the shapes features to print out
                   {
                       if(myShape.shapes.get(i) instanceof Square)
                       {
                       System.out.println("The square having tha area: " + myShape.shapes.get(i).getArea() + " and the perimeter: " + myShape.shapes.get(i).getPerimeter() + " is removed");
                       myShape.shapes.remove(i);
                       }

                        else if(myShape.shapes.get(i) instanceof Rectangle) {
                       System.out.println("The rectangle having tha area: " + myShape.shapes.get(i).getArea() + " and the perimeter: " + myShape.shapes.get(i).getPerimeter() + " is removed");
                        myShape.shapes.remove(i);
                         }
                        else if(myShape.shapes.get(i) instanceof Triangle)
                         {
                        System.out.println("The triangle having tha area: " + myShape.shapes.get(i).getArea() + " and the perimeter: " + myShape.shapes.get(i).getPerimeter() + " is removed");
                        myShape.shapes.remove(i);
                        }
                        else if(myShape.shapes.get(i) instanceof Circle)
                        {
                       System.out.println("The circle having tha area: " + myShape.shapes.get(i).getArea() + " and the circumference: " + myShape.shapes.get(i).getPerimeter() + " is removed");
                        myShape.shapes.remove(i);
                        }
                   }

               }
               System.out.println(myShape);
            }

        }
    }
}
