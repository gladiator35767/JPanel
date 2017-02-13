import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JOptionPaneDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		
		Object[] options = {"Action", "Comedy", "Si-fi", "Drama"};
		className = JOptionPane.showOptionDialog(frame, "Which genre are you in the mood for?",
				"Your Genre",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[0]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Nothing better than a bit of lively action");
				final String[] Producer  = { "Kathleen Kennedy", "Finnur Joannsson", "Allison Sheamur"};
				switch(className)
				{
					case 0:
							{
								JOptionPane.showMessageDialog(frame, "Can't go wrong with that decision");
								Object[] movies = {"Rogue One", "War of the Worlds", "Jurassic Park"};
								className = JOptionPane.showOptionDialog(frame, "Which genre are you in the mood for?",
										"Your Genre",
										JOptionPane.YES_NO_CANCEL_OPTION,
										JOptionPane.QUESTION_MESSAGE,
										null, options, options[0]);
								
							}
				}
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Looking for a laugh?");
				final String[] Producer ={ "Marc Platt", "Gary Gilbert", "Jordan Horowitz"};
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "The best genre, done right");
				final String[] Producer ={ "Tara Subkoff", "Brendan Walsh", "Jason Ludman"};
				break;
				}
			case 3:
				{
				JOptionPane.showMessageDialog(frame, "Compeling plot to hold your interest");
				final String[] Producer ={ "Fred Berger", "Neal H. Moritz", "Stephen Hamel"};
				break;		
				}
			}
		final String[] operation = { "Addition", "Subtraction", "Multiplication", "Division" };

			{
			final JFrame frame = new JFrame();
		    String favoritePizza = (String) JOptionPane.showInputDialog(frame, 
		            "What type of adventure would you like to experience?",
		            "Adventure Genre",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            operation, 
		            operation[0]);
		    JOptionPane.showMessageDialog(frame, "");


		      }
	    }
	}