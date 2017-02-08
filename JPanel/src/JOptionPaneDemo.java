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
		
		Object[] options = {"Addition", "Subtraction", "Multiplication", "Division"};
		className = JOptionPane.showOptionDialog(frame, "Which operation would you like me to use?",
				"Your Operation",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[0]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Back to basics");
				JOptionPane.showMessageDialog(frame,"What is the first number that you would like to add?");
				
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Obvious option");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "Solid decision");
				break;
				}
			case 3:
				{
				JOptionPane.showMessageDialog(frame, "Good choice!");
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
		    JOptionPane.showMessageDialog(frame, "Math is everywhere!");


		      }
	    }
	}