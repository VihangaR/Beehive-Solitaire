// ***** IMPORTANT : RUN WITH THE WINDOW SET TO 800x800 *****
// ***** IMPORTANT : RUN WITH THE WINDOW SET TO 800x800 *****
// ***** IMPORTANT : RUN WITH THE WINDOW SET TO 800x800 *****
// ***** IMPORTANT : RUN WITH THE WINDOW SET TO 800x800 *****
// ***** IMPORTANT : RUN WITH THE WINDOW SET TO 800x800 *****
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;

public class BeehilveSolitaire extends Applet implements MouseListener, MouseMotionListener, ActionListener // Applet
{
    Graphics g;

    //Temporary Classes
    CardClass temp;
    CardClass Bruh;
    CardClass Main;
    CardClass temp2;
    CardClass temp3;
    CardClass temp4;
    //Temporary Classes

    //Button
    Button buttonStart = new Button ("Start Game");
    Button instructions = new Button ("Instructions");
    //Button

    //Temporary Variables
    int T1 = 0;
    int T2 = 0;
    int T3 = 0;
    int T4 = 0;
    int T5 = 0;
    int T6 = 0;
    //Temporary Variables

    boolean isMenu = true; //boolean variable for the start menu
    boolean startGame = false; //boolean variable for the startup animations
    boolean inst = false; //boolean variable for card sliding animations

    // Used to read image files
    BufferedImage img;
    BufferedImage img2;
    BufferedImage img3;
    BufferedImage img4;


    DeckClass maindeck; //Deck in bottom left
    DeckClass pile[] = new DeckClass [7]; //7 Tableau piles

    int end = 5555; //Add to end

    int gCounter = 0; //Number of clicks

    //Different Value Counters (Ace, 2, 3, 4...)
    int Count = 0;
    int Count2 = 0;
    int Count3 = 0;
    int Count4 = 0;
    int Count5 = 0;
    int Count6 = 0;
    int Count7 = 0;
    int Count8 = 0;
    int Count9 = 0;
    int Count10 = 0;
    int Count11 = 0;
    int Count12 = 0;
    int Count13 = 0;
    //Different Value Counters (Ace, 2, 3, 4...)

    public void init ()
    {
	buttonStart.addActionListener (this);
	instructions.addActionListener (this);
	add (buttonStart);
	add (instructions);
	addMouseListener (this); // applet
	addMouseMotionListener (this); //applet
	maindeck = new DeckClass ('s'); // New Deck

	for (int i = 0 ; i < pile.length ; i++)
	{
	    pile [i] = new DeckClass (); // New Piles
	}

	maindeck.shuffle (); // Shuffle

	for (int i = 0 ; i < 1 ; i++)
	{
	    for (int k = 0 ; k < 6 ; k++)
	    {
		pile [k].addCard (maindeck.moveCard (0), end); // Add one card for each tableau
	    }
	}

	for (int i = 0 ; i < 3 ; i++)
	{
	    pile [6].addCard (maindeck.moveCard (0), end); // Add three cards for side deck
	}



    }


    //Button actions
    public void actionPerformed (ActionEvent e)
    {
	Object objSource = e.getSource ();

	if (objSource == buttonStart)
	{


	    remove (buttonStart);
	    remove (instructions);
	    inst = false;
	    startGame = true;
	    isMenu = false;
	    repaint ();

	}
	else if (objSource == instructions)
	{
	    remove (instructions);
	    isMenu = false;
	    inst = true;
	    repaint ();
	}


    }



    public void mouseEntered (MouseEvent e)
    {
	// called when the pointer enters the applet's rectangular area
    }


    public void mouseExited (MouseEvent e)
    {
	// called when the pointer leaves the applet's rectangular area
    }


    public void mouseClicked (MouseEvent e)  // When a mouse is clicked
    {



	// Move cards to first tableau

	if (pile [6].getNumberOfCards () > 0)
	{
	    temp = pile [6].getBotCard ();
	    if (pile [0].getNumberOfCards () > 0)
	    {
		Bruh = pile [0].getBotCard ();
		if (temp.isPointInside (e.getX (), e.getY ()) == true)
		{
		    if (temp.getValue () == Bruh.getValue ())
		    {
			pile [0].addCard (temp, end);
			pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			repaint ();
		    }
		}
	    }
	}

	// Move cards to second tableau

	if (pile [6].getNumberOfCards () > 0)
	{
	    temp = pile [6].getBotCard ();
	    if (pile [1].getNumberOfCards () > 0)
	    {
		Bruh = pile [1].getBotCard ();
		if (temp.isPointInside (e.getX (), e.getY ()) == true)
		{
		    if (temp.getValue () == Bruh.getValue ())
		    {
			pile [1].addCard (temp, end);
			pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			repaint ();
		    }
		}
	    }
	}

	// Move cards to third tableau

	if (pile [6].getNumberOfCards () > 0)
	{
	    temp = pile [6].getBotCard ();

	    if (pile [2].getNumberOfCards () > 0)
	    {
		Bruh = pile [2].getBotCard ();
		if (temp.isPointInside (e.getX (), e.getY ()) == true)
		{
		    if (temp.getValue () == Bruh.getValue ())
		    {
			pile [2].addCard (temp, end);
			pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			repaint ();
		    }
		}

	    }
	}

	// Move cards to fourth tableau

	if (pile [6].getNumberOfCards () > 0)
	{
	    temp = pile [6].getBotCard ();
	    if (pile [3].getNumberOfCards () > 0)
	    {
		Bruh = pile [3].getBotCard ();
		if (temp.isPointInside (e.getX (), e.getY ()) == true)
		{
		    if (temp.getValue () == Bruh.getValue ())
		    {
			pile [3].addCard (temp, end);
			pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			repaint ();
		    }
		}
	    }
	}

	// Move cards to fifth tableau

	if (pile [6].getNumberOfCards () > 0)
	{
	    temp = pile [6].getBotCard ();
	    if (pile [4].getNumberOfCards () > 0)
	    {
		Bruh = pile [4].getBotCard ();
		if (temp.isPointInside (e.getX (), e.getY ()) == true)
		{
		    if (temp.getValue () == Bruh.getValue ())
		    {
			pile [4].addCard (temp, end);
			pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			repaint ();
		    }
		}
	    }
	}

	// Move cards to sixth tableau

	if (pile [6].getNumberOfCards () > 0)
	{
	    temp = pile [6].getBotCard ();
	    if (pile [5].getNumberOfCards () > 0)
	    {
		Bruh = pile [5].getBotCard ();
		if (temp.isPointInside (e.getX (), e.getY ()) == true)
		{
		    if (temp.getValue () == Bruh.getValue ())
		    {
			pile [5].addCard (temp, end);
			pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			repaint ();
		    }

		}
	    }
	}

	// Move the cards on the side pile to the main deck and deal 3 new cards

	if (maindeck.getNumberOfCards () > 0)
	{
	    Main = maindeck.getTopCard ();
	    if (Main.isPointInside (e.getX (), e.getY ()) == true)
	    {

		while (pile [6].getNumberOfCards () != 0)
		{
		    maindeck.addCard (pile [6].moveCard (0), end);
		}

		maindeck.shuffle ();
		if (maindeck.getNumberOfCards () > 3)
		{

		    for (int i = 0 ; i < 3 ; i++)
		    {
			pile [6].addCard (maindeck.moveCard (0), end);
		    }
		}
		else
		{
		    for (int i = 0 ; i < maindeck.getNumberOfCards () ; i++)
		    {
			pile [6].addCard (maindeck.moveCard (0), end);
		    }
		}
		repaint ();
		gCounter += 1;
		//System.out.print (maindeck.getNumberOfCards () + " ");
	    }
	}


	//If first pile has max number of cards
	if (pile [0].getNumberOfCards () == 4)
	{

	    temp4 = pile [0].getBotCard ();
	    if (temp4.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (temp4.getValue () == 1)
		{
		    Count = 1;
		    repaint ();
		}
		if (temp4.getValue () == 2)
		{
		    Count2 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 3)
		{
		    Count3 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 4)
		{
		    Count4 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 5)
		{
		    Count5 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 6)
		{
		    Count6 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 7)
		{
		    Count7 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 8)
		{
		    Count8 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 9)
		{
		    Count9 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 10)
		{
		    Count10 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 11)
		{
		    Count11 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 12)
		{
		    Count12 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 13)
		{
		    Count13 = 1;
		    repaint ();
		}
		for (int k = 0 ; k < 4 ; k++)
		{
		    pile [0].removeCard (0);

		}
		if (maindeck.getNumberOfCards () > 3)
		{
		    if (pile [6].getNumberOfCards () == 0)
		    {
			for (int i = 0 ; i < 3 ; i++)
			{
			    pile [6].addCard (maindeck.moveCard (0), end);
			}
		    }

		    pile [0].addCard (pile [6].getBotCard (), end);
		    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
		}
		repaint ();
		//System.out.print (" Gone ");

	    }

	}

	//If second pile has max number of cards
	if (pile [1].getNumberOfCards () == 4)
	{

	    temp4 = pile [1].getBotCard ();
	    if (temp4.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (temp4.getValue () == 1)
		{
		    Count = 1;
		    repaint ();
		}
		if (temp4.getValue () == 2)
		{
		    Count2 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 3)
		{
		    Count3 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 4)
		{
		    Count4 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 5)
		{
		    Count5 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 6)
		{
		    Count6 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 7)
		{
		    Count7 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 8)
		{
		    Count8 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 9)
		{
		    Count9 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 10)
		{
		    Count10 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 11)
		{
		    Count11 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 12)
		{
		    Count12 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 13)
		{
		    Count13 = 1;
		    repaint ();
		}
		for (int k = 0 ; k < 4 ; k++)
		{
		    pile [1].removeCard (0);


		}
		if (maindeck.getNumberOfCards () > 3)
		{
		    if (pile [6].getNumberOfCards () == 0)
		    {
			for (int i = 0 ; i < 3 ; i++)
			{
			    pile [6].addCard (maindeck.moveCard (0), end);
			}
		    }
		    pile [1].addCard (pile [6].getBotCard (), end);
		    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
		}
		repaint ();
		//System.out.print (" Gone ");

	    }

	}

	//If third pile has max number of cards
	if (pile [2].getNumberOfCards () == 4)
	{

	    temp4 = pile [2].getBotCard ();
	    if (temp4.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (temp4.getValue () == 1)
		{
		    Count = 1;
		    repaint ();
		}
		if (temp4.getValue () == 2)
		{
		    Count2 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 3)
		{
		    Count3 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 4)
		{
		    Count4 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 5)
		{
		    Count5 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 6)
		{
		    Count6 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 7)
		{
		    Count7 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 8)
		{
		    Count8 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 9)
		{
		    Count9 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 10)
		{
		    Count10 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 11)
		{
		    Count11 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 12)
		{
		    Count12 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 13)
		{
		    Count13 = 1;
		    repaint ();
		}
		for (int k = 0 ; k < 4 ; k++)
		{
		    pile [2].removeCard (0);


		}
		if (maindeck.getNumberOfCards () > 3)
		{
		    if (pile [6].getNumberOfCards () == 0)
		    {
			for (int i = 0 ; i < 3 ; i++)
			{
			    pile [6].addCard (maindeck.moveCard (0), end);
			}
		    }
		    pile [2].addCard (pile [6].getBotCard (), end);
		    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
		}
		repaint ();
		//System.out.print (" Gone ");

	    }

	}

	//If fourth pile has max number of cards
	if (pile [3].getNumberOfCards () == 4)
	{

	    temp4 = pile [3].getBotCard ();
	    if (temp4.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (temp4.getValue () == 1)
		{
		    Count = 1;
		    repaint ();
		}
		if (temp4.getValue () == 2)
		{
		    Count2 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 3)
		{
		    Count3 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 4)
		{
		    Count4 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 5)
		{
		    Count5 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 6)
		{
		    Count6 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 7)
		{
		    Count7 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 8)
		{
		    Count8 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 9)
		{
		    Count9 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 10)
		{
		    Count10 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 11)
		{
		    Count11 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 12)
		{
		    Count12 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 13)
		{
		    Count13 = 1;
		    repaint ();
		}
		for (int k = 0 ; k < 4 ; k++)
		{
		    pile [3].removeCard (0);


		}
		if (maindeck.getNumberOfCards () > 3)
		{
		    if (pile [6].getNumberOfCards () == 0)
		    {
			for (int i = 0 ; i < 3 ; i++)
			{
			    pile [6].addCard (maindeck.moveCard (0), end);
			}
		    }
		    pile [3].addCard (pile [6].getBotCard (), end);
		    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
		}
		repaint ();
		//System.out.print (" Gone ");

	    }

	}

	//If fifth pile has max number of cards
	if (pile [4].getNumberOfCards () == 4)
	{

	    temp4 = pile [4].getBotCard ();
	    if (temp4.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (temp4.getValue () == 1)
		{
		    Count = 1;
		    repaint ();
		}
		if (temp4.getValue () == 2)
		{
		    Count2 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 3)
		{
		    Count3 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 4)
		{
		    Count4 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 5)
		{
		    Count5 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 6)
		{
		    Count6 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 7)
		{
		    Count7 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 8)
		{
		    Count8 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 9)
		{
		    Count9 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 10)
		{
		    Count10 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 11)
		{
		    Count11 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 12)
		{
		    Count12 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 13)
		{
		    Count13 = 1;
		    repaint ();
		}
		for (int k = 0 ; k < 4 ; k++)
		{
		    pile [4].removeCard (0);


		}
		if (maindeck.getNumberOfCards () > 3)
		{
		    if (pile [6].getNumberOfCards () == 0)
		    {
			for (int i = 0 ; i < 3 ; i++)
			{
			    pile [6].addCard (maindeck.moveCard (0), end);
			}
		    }
		    pile [4].addCard (pile [6].getBotCard (), end);
		    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
		}
		repaint ();
		//System.out.print (" Gone ");

	    }

	}

	//If sixth pile has max number of cards
	if (pile [5].getNumberOfCards () == 4)
	{

	    temp4 = pile [5].getBotCard ();
	    if (temp4.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (temp4.getValue () == 1)
		{
		    Count = 1;
		    repaint ();
		}
		if (temp4.getValue () == 2)
		{
		    Count2 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 3)
		{
		    Count3 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 4)
		{
		    Count4 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 5)
		{
		    Count5 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 6)
		{
		    Count6 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 7)
		{
		    Count7 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 8)
		{
		    Count8 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 9)
		{
		    Count9 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 10)
		{
		    Count10 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 11)
		{
		    Count11 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 12)
		{
		    Count12 = 1;
		    repaint ();
		}
		if (temp4.getValue () == 13)
		{
		    Count13 = 1;
		    repaint ();
		}
		for (int k = 0 ; k < 4 ; k++)
		{
		    pile [5].removeCard (0);


		}
		if (maindeck.getNumberOfCards () > 3)
		{
		    if (pile [6].getNumberOfCards () == 0)
		    {
			for (int i = 0 ; i < 3 ; i++)
			{
			    pile [6].addCard (maindeck.moveCard (0), end);
			}
		    }
		    pile [5].addCard (pile [6].getBotCard (), end);
		    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
		}
		repaint ();
		//System.out.print (" Gone ");

	    }

	}

	//End Max

	//Checks for duplicates of the same value with the first pile
	if (pile [0].getNumberOfCards () > 0)
	{
	    temp2 = pile [0].getBotCard ();
	    if (temp2.isPointInside (e.getX (), e.getY ()) == true)
	    {
		for (int i = 1 ; i < 6 ; i++)
		{
		    if (pile [i].getNumberOfCards () > 0)
		    {
			temp3 = pile [i].getBotCard ();
			if (temp2.getValue () == temp3.getValue ())
			{
			    while (pile [i].getNumberOfCards () != 0)
			    {
				pile [0].addCard (temp3, end);
				pile [i].removeCard (0);
			    }
			    if (maindeck.getNumberOfCards () > 0)
			    {
				if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				{
				    for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }
				}
				else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				{
				    for (int y = 0 ; y < 3 ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }
				}

				pile [i].addCard (pile [6].getBotCard (), end);
				pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			    }
			    repaint ();
			}
		    }
		}
	    }
	}




	//Checks for duplicates of the same value with the second pile


	if (pile [1].getNumberOfCards () > 0)
	{
	    temp2 = pile [1].getBotCard ();
	    if (temp2.isPointInside (e.getX (), e.getY ()) == true)
	    {
		if (pile [0].getNumberOfCards () > 0)
		{
		    if (temp2.getValue () == pile [0].getBotCard ().getValue ())
		    {
			while (pile [0].getNumberOfCards () != 0)
			{
			    pile [1].addCard (pile [0].getBotCard (), end);
			    pile [0].removeCard (0);
			}
			if (maindeck.getNumberOfCards () > 0)
			{

			    if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
			    {
				for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
				{
				    pile [6].addCard (maindeck.moveCard (0), end);
				}
			    }
			    else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
			    {
				for (int y = 0 ; y < 3 ; y++)
				{
				    pile [6].addCard (maindeck.moveCard (0), end);
				}


			    }
			    pile [0].addCard (pile [6].getBotCard (), end);
			    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
			    repaint ();
			}
		    }
		    for (int i = 2 ; i < 6 ; i++)
		    {
			if (pile [i].getNumberOfCards () > 0)
			{
			    temp3 = pile [i].getBotCard ();
			    if (temp2.getValue () == temp3.getValue ())
			    {
				while (pile [i].getNumberOfCards () != 0)
				{
				    pile [1].addCard (temp3, end);
				    pile [i].removeCard (0);
				}
				if (maindeck.getNumberOfCards () > 0)
				{

				    if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				    {
					for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}
				    }
				    else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				    {
					for (int y = 0 ; y < 3 ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}
				    }
				    pile [i].addCard (pile [6].getBotCard (), end);
				    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				    repaint ();
				}
			    }
			}
		    }
		}
	    }
	}
	//Checks for duplicates of the same value with the third pile

	if (pile [2].getNumberOfCards () > 0)
	{
	    temp2 = pile [2].getBotCard ();
	    if (temp2.isPointInside (e.getX (), e.getY ()) == true)
	    {
		for (int i = 0 ; i < 2 ; i++)
		{
		    if (pile [i].getNumberOfCards () > 0)
		    {
			temp3 = pile [i].getBotCard ();
			if (temp2.getValue () == temp3.getValue ())
			{
			    while (pile [i].getNumberOfCards () != 0)
			    {
				pile [2].addCard (temp3, end);
				pile [i].removeCard (0);
			    }
			    if (maindeck.getNumberOfCards () > 0)
			    {

				if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				{
				    for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }
				}
				else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				{
				    for (int y = 0 ; y < 3 ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }
				}
				pile [i].addCard (pile [6].getBotCard (), end);
				pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				repaint ();
			    }
			}
		    }
		    for (int k = 3 ; k < 6 ; k++)
		    {
			if (pile [k].getNumberOfCards () > 0)
			{
			    temp3 = pile [k].getBotCard ();
			    if (temp2.getValue () == temp3.getValue ())
			    {
				while (pile [k].getNumberOfCards () != 0)
				{
				    pile [2].addCard (temp3, end);
				    pile [k].removeCard (0);
				}
				if (maindeck.getNumberOfCards () > 0)
				{

				    if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				    {
					for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}
				    }
				    else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				    {
					for (int y = 0 ; y < 3 ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}



				    }
				    pile [k].addCard (pile [6].getBotCard (), end);
				    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				    repaint ();
				}
			    }
			}
		    }
		}
	    }
	}


	//Checks for duplicates of the same value with the fourth pile

	if (pile [3].getNumberOfCards () > 0)
	{
	    temp2 = pile [3].getBotCard ();
	    if (temp2.isPointInside (e.getX (), e.getY ()) == true)
	    {
		for (int i = 0 ; i < 3 ; i++)
		{
		    if (pile [i].getNumberOfCards () > 0)
		    {
			temp3 = pile [i].getBotCard ();
			if (temp2.getValue () == temp3.getValue ())
			{
			    while (pile [i].getNumberOfCards () != 0)
			    {
				pile [3].addCard (temp3, end);
				pile [i].removeCard (0);
			    }
			    if (maindeck.getNumberOfCards () > 0)
			    {
				if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				{
				    for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }
				}
				else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				{
				    for (int y = 0 ; y < 3 ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }


				}
				pile [i].addCard (pile [6].getBotCard (), end);
				pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				repaint ();
			    }
			}
		    }
		    for (int k = 4 ; k < 6 ; k++)
		    {
			if (pile [k].getNumberOfCards () > 0)
			{
			    temp3 = pile [k].getBotCard ();
			    if (temp2.getValue () == temp3.getValue ())
			    {
				while (pile [k].getNumberOfCards () != 0)
				{
				    pile [3].addCard (temp3, end);
				    pile [k].removeCard (0);
				}
				if (maindeck.getNumberOfCards () > 0)
				{

				    if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				    {
					for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}
				    }
				    else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				    {
					for (int y = 0 ; y < 3 ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}


				    }
				    pile [k].addCard (pile [6].getBotCard (), end);
				    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				    repaint ();
				}
			    }
			}
		    }
		}
	    }
	}


	//Checks for duplicates of the same value with the fifth pile


	if (pile [4].getNumberOfCards () > 0)
	{
	    temp2 = pile [4].getBotCard ();
	    if (temp2.isPointInside (e.getX (), e.getY ()) == true)
	    {
		for (int i = 0 ; i < 4 ; i++)
		{
		    if (pile [i].getNumberOfCards () > 0)
		    {
			temp3 = pile [i].getBotCard ();
			if (temp2.getValue () == temp3.getValue ())
			{
			    while (pile [i].getNumberOfCards () != 0)
			    {
				pile [4].addCard (temp3, end);
				pile [i].removeCard (0);
			    }
			    if (maindeck.getNumberOfCards () > 0)
			    {

				if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				{
				    for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }
				}
				else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				{
				    for (int y = 0 ; y < 3 ; y++)
				    {
					pile [6].addCard (maindeck.moveCard (0), end);
				    }


				}
				pile [i].addCard (pile [6].getBotCard (), end);
				pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				repaint ();
			    }
			}
		    }
		    for (int k = 5 ; k < 6 ; k++)
		    {
			if (pile [k].getNumberOfCards () > 0)
			{
			    temp3 = pile [k].getBotCard ();
			    if (temp2.getValue () == temp3.getValue ())
			    {
				while (pile [k].getNumberOfCards () != 0)
				{
				    pile [4].addCard (temp3, end);
				    pile [k].removeCard (0);
				}
				if (maindeck.getNumberOfCards () > 0)
				{

				    if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				    {
					for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}
				    }
				    else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				    {
					for (int y = 0 ; y < 3 ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}






				    }
				    pile [k].addCard (pile [6].getBotCard (), end);
				    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				    repaint ();
				}
			    }
			}
		    }
		}
	    }

	    //Checks for duplicates of the same value with the sixth pile

	    if (pile [5].getNumberOfCards () > 0)
	    {
		temp2 = pile [5].getBotCard ();
		if (temp2.isPointInside (e.getX (), e.getY ()) == true)
		{

		    for (int i = 0 ; i < 5 ; i++)
		    {
			if (pile [i].getNumberOfCards () > 0)
			{
			    temp3 = pile [i].getBotCard ();
			    if (temp2.getValue () == temp3.getValue ())
			    {
				while (pile [i].getNumberOfCards () != 0)
				{
				    pile [5].addCard (temp3, end);
				    pile [i].removeCard (0);
				}
				if (maindeck.getNumberOfCards () > 0)
				{

				    if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () < 3)
				    {
					for (int y = 0 ; y < maindeck.getNumberOfCards () ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}
				    }
				    else if (pile [6].getNumberOfCards () == 0 && maindeck.getNumberOfCards () >= 3)
				    {
					for (int y = 0 ; y < 3 ; y++)
					{
					    pile [6].addCard (maindeck.moveCard (0), end);
					}






				    }
				    pile [i].addCard (pile [6].getBotCard (), end);
				    pile [6].removeCard (pile [6].getNumberOfCards () - 1);
				    repaint ();
				}
			    }
			}

		    }
		}

	    }
	}


	//Fall back to check if all piles are filled, only if they can filled tho
	if (pile [6].getNumberOfCards () > 0 && maindeck.getNumberOfCards () > 0)
	{
	    if (pile [0].getNumberOfCards () == 0 && pile [6].getNumberOfCards () > 0)
	    {
		pile [0].addCard (pile [6].getBotCard (), end);
		pile [6].removeCard (pile [6].getNumberOfCards () - 1);
	    }

	    if (pile [1].getNumberOfCards () == 0 && pile [6].getNumberOfCards () > 0)
	    {
		pile [1].addCard (pile [6].getBotCard (), end);
		pile [6].removeCard (pile [6].getNumberOfCards () - 1);
	    }

	    if (pile [2].getNumberOfCards () == 0 && pile [6].getNumberOfCards () > 0)
	    {
		pile [2].addCard (pile [6].getBotCard (), end);
		pile [6].removeCard (pile [6].getNumberOfCards () - 1);
	    }

	    if (pile [3].getNumberOfCards () == 0 && pile [6].getNumberOfCards () > 0)
	    {
		pile [3].addCard (pile [6].getBotCard (), end);
		pile [6].removeCard (pile [6].getNumberOfCards () - 1);
	    }

	    if (pile [4].getNumberOfCards () == 0 && pile [6].getNumberOfCards () > 0)
	    {
		pile [4].addCard (pile [6].getBotCard (), end);
		pile [6].removeCard (pile [6].getNumberOfCards () - 1);
	    }

	    if (pile [5].getNumberOfCards () == 0 && pile [6].getNumberOfCards () > 0)
	    {
		pile [5].addCard (pile [6].getBotCard (), end);
		pile [6].removeCard (pile [6].getNumberOfCards () - 1);
	    }
	}
    }





    public void mousePressed (MouseEvent e)
    { // called after a button is pressed down





    }


    public void mouseReleased (MouseEvent e)
    { // called after a button is released

    }


    public void mouseMoved (MouseEvent e)
    { // called during motion when no buttons are down

    }


    public void mouseDragged (MouseEvent e)
    { // called during motion with buttons down

    }






    public void paint (Graphics g)  //draws game
    {
	if (isMenu == true) //Draw out the title screen
	{
	    setBackground (new Color (0, 200, 225));

	    try
	    {
		// Read the image Files
		img = ImageIO.read (new File ("Start.jpg"));
	    }
	    catch (IOException e)
	    {

	    }

	    // Draw everything in the title
	    g.drawImage (img, 0, 0, this);

	}
	else if (inst == true)
	{
	    try
	    {
		// Read the image Files
		img3 = ImageIO.read (new File ("BeeH.jpg"));

	    }
	    catch (IOException e)
	    {

	    }

	    // Draw everything in the title
	    g.drawImage (img3, 0, 0, this);

	}

	else if (startGame == true)
	{
	    try
	    {
		// Read the image Files
		img2 = ImageIO.read (new File ("gMain.jpg"));
		img4 = ImageIO.read (new File ("gMainWINNER.jpg"));
	    }
	    catch (IOException e)
	    {

	    }
	    g.drawImage (img2, 0, 0, this);
	    setBackground (new Color (224, 224, 224));
	    maindeck.setCentre (100, 350);
	    maindeck.drawFlip (g);


	    pile [0].setCentre (100, 100);
	    pile [1].setCentre (200, 100);
	    pile [2].setCentre (300, 100);
	    pile [3].setCentre (400, 100);
	    pile [4].setCentre (500, 100);
	    pile [5].setCentre (600, 100);
	    pile [6].setCentre (200, 350);




	    for (int i = 0 ; i < 7 ; i++)
	    {
		pile [i].drawTableau (g);
	    }


	    //Draws out the face values
	    Font font = new Font ("Serif", Font.PLAIN, 45);
	    g.setFont (font);
	    g.drawString ("A", 90, 555);
	    g.drawString ("2", 165, 555);
	    g.drawString ("3", 235, 555);
	    g.drawString ("4", 305, 555);
	    g.drawString ("5", 375, 555);
	    g.drawString ("6", 445, 555);
	    g.drawString ("7", 515, 555);
	    g.drawString ("8", 585, 555);
	    g.drawString ("9", 655, 555);
	    g.drawString ("10", 255, 655);
	    g.drawString ("J", 342, 655);
	    g.drawString ("Q", 405, 655);
	    g.drawString ("K", 475, 655);

	    setForeground (Color.blue);

	    //Checks if the game has been won
	    if (Count > 0 && Count2 > 0 && Count3 > 0 && Count4 > 0 && Count5 > 0 && Count6 > 0 && Count7 > 0 && Count8 > 0 && Count9 > 0 && Count10 > 0 && Count11 > 0 && Count12 > 0 && Count13 > 0)
	    {

		g.drawImage (img4, 0, 0, this);

	    }
	    //Sets the cards and once there are four of a kind, it fills it out with a colour
	    if (Count == 0)
	    {
		g.drawRoundRect (75, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (75, 500, 60, 80, 10, 10);

	    }


	    if (Count2 == 0)
	    {
		g.drawRoundRect (145, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (145, 500, 60, 80, 10, 10);
	    }


	    if (Count3 == 0)
	    {
		g.drawRoundRect (215, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (215, 500, 60, 80, 10, 10);
	    }


	    if (Count4 == 0)
	    {
		g.drawRoundRect (285, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (285, 500, 60, 80, 10, 10);
	    }


	    if (Count5 == 0)
	    {
		g.drawRoundRect (355, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (355, 500, 60, 80, 10, 10);
	    }


	    if (Count6 == 0)
	    {
		g.drawRoundRect (425, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (425, 500, 60, 80, 10, 10);
	    }


	    if (Count7 == 0)
	    {
		g.drawRoundRect (495, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (495, 500, 60, 80, 10, 10);
	    }


	    if (Count8 == 0)
	    {
		g.drawRoundRect (565, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (565, 500, 60, 80, 10, 10);
	    }


	    if (Count9 == 0)
	    {
		g.drawRoundRect (635, 500, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (635, 500, 60, 80, 10, 10);
	    }


	    if (Count10 == 0)
	    {
		g.drawRoundRect (250, 600, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (250, 600, 60, 80, 10, 10);
	    }


	    if (Count11 == 0)
	    {
		g.drawRoundRect (320, 600, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (320, 600, 60, 80, 10, 10);
	    }


	    if (Count12 == 0)
	    {
		g.drawRoundRect (390, 600, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (390, 600, 60, 80, 10, 10);
	    }


	    if (Count13 == 0)
	    {
		g.drawRoundRect (460, 600, 60, 80, 10, 10);
	    }


	    else
	    {
		g.fillRoundRect (460, 600, 60, 80, 10, 10);
	    }


	    // Shuffle Counter
	    Font woops = new Font ("Serif", Font.PLAIN, 15);
	    g.setFont (woops);
	    g.drawString ("Number of shuffles: " + gCounter, 30, 415);
	}
    }
}


