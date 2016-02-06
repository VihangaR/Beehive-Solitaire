import java.awt.*;

public abstract class ShapeClass
{
    protected int width;
    protected int height;
    protected int centrex;
    protected int centrey;
    protected Color boxcolour = Color.black;
    protected Color colour;
    protected boolean erasecard = false;

    public abstract void draw (Graphics c);

    public void setboxcolour (Color newcolour){
    boxcolour = newcolour;
    }
    
    public Color getboxcolour(){
    return boxcolour;
    }

    public void setWidth (int iNewWidth)
    {
	width = iNewWidth;
    }


    public void setHeight (int iNewHeight)
    {
	height = iNewHeight;
    }


    public void setCentre (int iNewCornerX, int iNewCornerY)
    {
	centrex = iNewCornerX;
	centrey = iNewCornerY;
    }


    public void setColor (Color cNewColor)
    {
	colour = cNewColor;
    }


    public int getWidth ()
    {
	return width;
    }


    public int getHeight ()
    {
	return height;
    }


    public int getCornerX ()
    {
	return centrex;
    }


    public int getCornerY ()
    {
	return centrey;
    }



    public Color getColor ()
    {
	return colour;
    }


    public void delay (int iDelayTime)
    {
	long lFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	}

	while (lFinalTime >= System.currentTimeMillis ());
    }


    public void erase (Graphics c)
    {

	Color cOldColor = getColor ();
	setColor (Color.cyan);
	draw (c);
	setColor (cOldColor);
    }
    
	public void erasemove (Graphics c)
    {
    erasecard = true;
	Color cOldColor = getColor ();
	setColor (Color.cyan);
	draw (c);
	setColor (cOldColor);
    }
    
    public boolean isPointInside (int getx, int gety)
    {
	if (getx > centrex - (width / 2) && getx < centrex + (width / 2))
	{
	    if (gety > centrey - (height / 2) && gety < centrey + (height / 2))
	    {
		return true;
	    }
	    else
	    {
		return false;
	    }
	}
	else
	{
	    return false;
	}
    }
    
}
