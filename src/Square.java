/**
 * a class specify the features of the square
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
public class Square extends Rectangle {
    private int side;

    public Square(int side)
    {
        super(side,side); //rectangle class is as a parent
        this.side = side;

    }


}
