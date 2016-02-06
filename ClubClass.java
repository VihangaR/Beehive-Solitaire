

import java.awt.*;

public class ClubClass extends SuitClass
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
	c.setColor (colour);
	c.fillOval (centrex - width / 3, centrey - height / 4, width * 4 / 10, height * 4 / 10);
	c.fillOval (centrex - width / 16, centrey - height / 4, width * 4 / 10, height * 4 / 10);
	c.fillOval (centrex - width / 5, centrey - height / 2, width * 4 / 10, height * 4 / 10);
	c.fillRect (centrex - width / 20, centrey, width * 2 / 20, height * 4 / 10);

    }
}
