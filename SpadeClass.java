

import java.awt.*;

public class SpadeClass extends SuitClass
{

    protected boolean filled = true;


    public void setIsFilled (boolean newfilled)
    {
	filled = newfilled;
    }


    public boolean getIsFilled ()
    {
	return filled;
    }


    public void draw (Graphics c)
    {
	// declare two arrays for X & Y coordinates of Diamond
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = centrex - width / 3;
	iPointsY [0] = centrey;
	iPointsX [1] = centrex;
	iPointsY [1] = centrey - height / 2;
	iPointsX [2] = centrex + width / 3;
	iPointsY [2] = centrey;
	iPointsX [3] = centrex;
	iPointsY [3] = centrey;

	// draw the diamond using methods available from the Graphics object (c)
	c.setColor (colour);
	if (filled)
	{
	    c.fillPolygon (iPointsX, iPointsY, 4);
	}
	else
	{
	    c.drawPolygon (iPointsX, iPointsY, 4);
	}

	c.fillOval (centrex - width / 3, centrey - height / 7, width * 4 / 10, height * 4 / 10);
	c.fillOval (centrex - width / 16, centrey - height / 7, width * 4 / 10, height * 4 / 10);
	c.fillRect (centrex - width / 20, centrey, width * 2 / 20, height * 4 / 10);

    }
}
