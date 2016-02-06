import java.awt.*;

public abstract class MShapeClass extends ShapeClass
{


    public void slideTo (Graphics c, int newX, int newY)
    {
	int Y = getCornerY ();
	int X = getCornerX ();


	int tempx = (newX - X) / 20;
	int tempy = (newY - Y) / 20;

	for (int i = 0 ; i < 21 ; i++)
	{
	    erase (c);
	    setColor (colour);
	    setCentre (centrex + tempx, centrey + tempy);
	    draw (c);
	    delay (100);
	}

	draw (c);


    }
}
