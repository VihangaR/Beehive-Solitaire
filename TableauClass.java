// The "TableauClass" Class
import java.util.*;
import java.awt.*;
import hsa.Console;

public class TableauClass extends MShapes
{

    private Vector stack = new Vector (0, 1);
    private String size;

    public TableauClass ()
    {
	setSize ("medium");
    }


    public TableauClass (String sizeNew)
    {
	setSize (sizeNew);
    }


    public void forceAddCard (CardClass cardToAdd)
    {
	CardClass temp = cardToAdd;
	temp.setSize (size);
	stack.addElement (new CellClass (temp));
	((CellClass) (stack.elementAt (stack.size () - 1))).setCenter (x, y + (20 * (stack.size () - 1)));
    }


    public void setCenter (int xNew, int yNew)
    {
	super.setCenter (xNew, yNew);
	for (int i = 0 ; i < stack.size () ; i++)
	{
	    ((CellClass) (stack.elementAt (i))).setCenter (xNew, yNew + (20 * i));
	}
    }


    public boolean addCard (CardClass cardToAdd)
    {
	if (stack.size () > 0)
	{
	    if ((cardToAdd.getSuit () == 1) || (cardToAdd.getSuit () == 3))
	    {
		if (((((CellClass) (stack.elementAt (stack.size () - 1))).viewCard (-1)).getSuit ()) == 2 || ((((CellClass) (stack.elementAt (stack.size () - 1))).viewCard (-1)).getSuit ()) == 4)
		{
		    if ((cardToAdd.getValue () - (((CellClass) (stack.elementAt (stack.size () - 1))).viewCard (-1)).getValue ()) == -1)
		    {
			forceAddCard (cardToAdd);
			return true;
		    }
		}
	    }
	    else if ((cardToAdd.getSuit () == 2) || (cardToAdd.getSuit () == 4))
	    {
		if (((((CellClass) (stack.elementAt (stack.size () - 1))).viewCard (-1)).getSuit ()) == 1 || ((((CellClass) (stack.elementAt (stack.size () - 1))).viewCard (-1)).getSuit ()) == 3)
		{
		    if ((cardToAdd.getValue () - (((CellClass) (stack.elementAt (stack.size () - 1))).viewCard (-1)).getValue ()) == -1)
		    {
			forceAddCard (cardToAdd);
			return true;
		    }
		}
	    }
	    return false;
	}
	else
	{
	    forceAddCard (cardToAdd);
	    return true;
	}
    }


    public CardClass dealCard (int pos)
    {
	if (pos == stack.size ())
	{
	    return ((CardClass) ((CellClass) (stack.remove (stack.size () - 1))).dealCard (-1));
	}


	else
	{
	    return ((CardClass) ((CellClass) (stack.remove (stack.size () - 1))).dealCard (-1));
	}
    }


    public int whichCard (int xPos, int yPos)
    {
	if (stack.size () > 0)
	{
	    for (int i = 0 ; i < stack.size () - 1 ; i++)
	    {
		if ((yPos >= (y - (height / 2) + (20 * i))) && (yPos <= (y - (height / 2) + (20 * (i + 1)))))
		{
		    if ((xPos >= x - (width / 2)) && (xPos <= x + (width / 2)))
		    {
			return i + 1;
		    }
		}
	    }
	    if ((yPos >= (y - (height / 2) + (20 * stack.size () - 1))) && (yPos <= (y - (height / 2) + (20 * (stack.size () - 1)) + (((CellClass) (stack.elementAt (stack.size ()))).viewCard (-1)).getHeight ())))
	    {
		if ((xPos >= x - (width / 2)) && (xPos <= x + (width / 2)))
		{
		    return stack.size ();
		}
	    }
	}


	return 0;
    }


    public boolean isPointInside (int getx, int gety)
    {
	if (getx > x - width / 2 && getx < x + width / 2)
	{
	    if (gety > (y - (height / 2)) && gety < (y + (height / 2) + (20 * (stack.size () - 1))))
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


    public boolean isEmpty ()
    {
	return stack.isEmpty ();
    }


    public void setSize (String sizeNew)
    {
	size = sizeNew;
	if (size == "small")
	{
	    setHeight (60);
	}


	else if (size == "medium")
	{
	    setHeight (80);
	}


	else if (size == "large")
	{
	    setHeight (100);
	}


	else if (size == "extra large")
	{
	    setHeight (120);
	}


	for (int i = 0 ; i < stack.size () ; i++)
	{
	    ((CellClass) (stack.elementAt (i))).setSize (sizeNew);
	}
    }


    public void setWidth (int newWidth)
    {
	width = newWidth;
	height = newWidth * 10 / 7;
    }


    public void setHeight (int newHeight)
    {
	height = newHeight;
	width = newHeight * 7 / 10;
    }


    public void draw (Console c)
    {
	if (stack.size () != 0)
	{
	    for (int i = 0 ; i < stack.size () ; i++)
	    {
		((CellClass) (stack.elementAt (i))).draw (c);
	    }
	}
    }


    public void draw (Graphics c)
    {
	if (stack.size () != 0)
	{
	    for (int i = 0 ; i < stack.size () ; i++)
	    {
		((CellClass) (stack.elementAt (i))).draw (c);
	    }
	}
	else
	{
	    c.setColor (Color.black);
	    c.drawRect (x - (width / 2), y - (height / 2), width, height);
	}
    }
}


