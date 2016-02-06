import java.awt.*;

public class CardClass extends MShapeClass

{

    protected int cardValue = 1;
    protected int suit = 1;
    protected boolean isFlipped = false;



    public void setHeight (int newHeight)
    {
	height = newHeight;
	width = ((newHeight * 7) / 10);
    }


    public void setWidth (int newWidth)
    {
	width = newWidth;
	height = ((newWidth * 10) / 7);
    }


    public void setValue (int nValue)
    {
	cardValue = nValue;
    }


    public void setSuit (int nS)
    {
	if (nS > -1 && nS < 5)
	{
	    suit = nS;
	    if (suit == 1 || suit == 3)
	    {
		setColor (Color.red);
	    }
	    else if (suit == 2 || suit == 4)
	    {
		setColor (Color.black);
	    }
	}
    }


    public void setFlip (boolean flipped)
    {
	isFlipped = flipped;
    }


    public void flip ()
    {
	if (isFlipped = true)
	{
	    isFlipped = false;
	}
	else if (isFlipped = false)
	{
	    isFlipped = true;
	}
    }


    public void setSize (int newSize)
    {
	if (newSize == 1)
	{
	    setHeight (75);
	}


	else if (newSize == 2)
	{
	    setHeight (120);
	}


	else if (newSize == 3)
	{
	    setHeight (140);
	}


	else if (newSize == 4)
	{
	    setHeight (160);
	}
    }



    public int getSuit ()
    {
	return suit;
    }


    public int getValue ()
    {
	return cardValue;
    }



    public void draw (Graphics c)
    {
	Color cOldColor = getColor ();
    if (erasecard == false){
	c.setColor (Color.white);
	}
	
	if (erasecard == true) {
	c.setColor (Color.green);
	}
	
	
	c.fillRect (centrex - width / 2, centrey - height / 2, width, height);
    
	if (suit == 1)
	{
	    DiamondClass d1 = new DiamondClass ();
	    d1.setCentre (centrex, centrey + height / 6);
	    d1.setHeight (height / 2);
	    d1.setColor (colour);
	    d1.draw (c);
	    d1.setCentre (centrex - width / 5, centrey - (height / 3));
	    d1.setHeight (height / 5);
	    d1.draw (c);

	}


	else if (suit == 2)
	{
	    ClubClass c1 = new ClubClass ();
	    c1.setCentre (centrex, centrey + height / 6);
	    c1.setHeight (height / 2);
	    c1.setColor (colour);
	    c1.draw (c);
	    c1.setCentre (centrex - width / 5, centrey - (height / 3));
	    c1.setHeight (height / 5);
	    c1.draw (c);

	}


	else if (suit == 3)
	{
	    HeartClass h1 = new HeartClass ();
	    h1.setCentre (centrex, centrey + height / 6);
	    h1.setHeight (height / 2);
	    h1.setColor (colour);
	    h1.draw (c);
	    h1.setCentre (centrex - width / 5, centrey - (height / 3));
	    h1.setHeight (height / 5);
	    h1.draw (c);

	}


	else if (suit == 4)
	{
	    SpadeClass s1 = new SpadeClass ();
	    s1.setCentre (centrex, centrey + height / 6);
	    s1.setHeight (height / 2);
	    s1.setColor (colour);
	    s1.draw (c);
	    s1.setCentre (centrex - width / 5, centrey - (height / 3));
	    s1.setHeight (height / 5);
	    s1.draw (c);
	}

	else if (suit == 0)
	{
	    c.setColor (Color.blue);
	    c.drawString ("TEMP", centrex - width / 2 + 10, centrey);
	}


	c.setColor (colour);

	if (cardValue == 1)
	{
	    c.drawString ("A", centrex, centrey - height / 2 + 18);
	}
	else if (cardValue == 11)
	{
	    c.drawString ("J", centrex, centrey - height / 2 + 18);
	}
	else if (cardValue == 12)
	{
	    c.drawString ("Q", centrex, centrey - height / 2 + 18);
	}
	else if (cardValue == 13)
	{
	    c.drawString ("K", centrex, centrey - height / 2 + 18);
	}
	else
	{
	    c.drawString ("" + cardValue, centrex, centrey - height / 2 + 18);
	}

	if (isFlipped == true)
	{
	    c.fillRect (centrex - width / 2, centrey - height / 2, width, height);
	}


	else
	{


	    c.setColor (boxcolour);

	    c.drawRect (centrex - width / 2, centrey - height / 2, width, height);
	}
    }
}


