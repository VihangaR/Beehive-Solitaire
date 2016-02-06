import hsa.Console;
import java.awt.*;
import java.util.*;

public class DeckClass extends MShapeClass
{
    protected Vector deck = new Vector (0, 1);


    public DeckClass ()
    {
    }


    public int getNumberOfCards ()
    {
	return deck.size ();
    }
    



    public DeckClass (char deckType)
    {
	if (deckType == 's')
	{
	
	    for (int suitnumber = 1 ; suitnumber < 5 ; suitnumber++)
	    {
		for (int valuenumber = 1 ; valuenumber < 14 ; valuenumber++)
		{
		    CardClass card1 = new CardClass ();
		    card1.setSuit (suitnumber);
		    card1.setValue (valuenumber);
		    card1.setFlip (false);
		    addCard (card1, 0);
		}
	    }
	}
    }


    public void addCard (CardClass cardToAdd, int cardposition)
    {
	if (cardposition == 0 || deck.size () == 0)
	{
	    deck.insertElementAt (cardToAdd, 0);
	}
	else if (cardposition > deck.size ())
	{
	    deck.insertElementAt (cardToAdd, deck.size ());
	}
	else
	{
	    deck.insertElementAt (cardToAdd, cardposition);
	}
    }


    public CardClass moveCard (int cardposition)
    {

	if (cardposition > deck.size ())
	{
	    CardClass card = (CardClass) deck.elementAt (deck.size ());
	    deck.removeElementAt (deck.size ());
	    return card;
	}
	else
	{
	    CardClass card = (CardClass) deck.elementAt (cardposition);
	    deck.removeElementAt (cardposition);
	    return card;
	}

    }


    public void removeCard (int cardposition)
    {

	if (cardposition > deck.size ())
	{
	    deck.removeElementAt (deck.size ());
	}
	else
	{
	    deck.removeElementAt (cardposition);
	}

    }


    public CardClass getTopCard ()
    {
	CardClass temp = (CardClass) deck.elementAt (0);
	return temp;
    }


    public CardClass getBotCard ()
    {

	CardClass temp = (CardClass) deck.elementAt (deck.size () - 1);
	return temp;
 
    }


    public void shuffle ()
    {
	for (int i = 0 ; i < 100 ; i++)
	{
	    int rand = (int) Math.floor (Math.random () * deck.size ());
	    CardClass temp = (CardClass) deck.elementAt (rand);
	    removeCard (rand);
	    addCard (temp, (int) Math.floor (Math.random () * deck.size ()));
	}
    }


    public void draw (Graphics g)
    {
	if (deck.size () > 0)
	{
	    CardClass temp = (CardClass) deck.elementAt (0);
	    temp.setCentre (centrex, centrey);
	    temp.setSize (1);
	    temp.draw (g);
	}
    }


    public void drawFlip (Graphics g)
    {
	if (deck.size () > 0)
	{
	    CardClass temp = (CardClass) deck.elementAt (0);
	    temp.setCentre (centrex, centrey);
	    temp.setSize (1);
	    temp.setFlip (true);
	    temp.draw (g);
	    temp.setFlip (false);
	}
    }


    public void drawTableau (Graphics g)
    {
	if (deck.size () > 0)
	{
	    CardClass temp = (CardClass) deck.elementAt (0);
	    for (int v = 0 ; v < deck.size () ; v++)
	    {
		temp.setCentre (centrex, centrey + (v - 1) * 30);
		temp.setSize (1);
		temp.draw (g);
     
	    //     if (v < (deck.size () - 1))
	    //     {
	    //         temp.setCentre (centrex, centrey + v * 25);
	    //         temp.setFlip (true);
	    // temp.erase (g);
	    //    
	    //         temp.setFlip (false);
	    //     }
	    // 
		if (v < deck.size () - 1)
		{
		    temp = (CardClass) deck.elementAt (v + 1);
		}

	    }
	}

    }


    public void erase (Graphics g)
    {
	CardClass temp = (CardClass) deck.elementAt (0);
	temp.erase (g);
    }




} 


