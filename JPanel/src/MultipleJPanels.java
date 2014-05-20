import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleJPanels extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name, class;

	public static void main(String[] args)
		{
		askName();
		askClass();
		}
	
	public static void askName()
		{
		JButton button = new JButton("Enter");
		
		final TextField txtfield = new TextField(20);
		final JLabel words = new JLabel("What is your name?");
		
		final JFrame frame = new JFrame("Welcome");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		frame.add(panel);
		panel.add(words);
		//panel.add(dropdown);
		panel.add(txtfield);
		panel.add(button);
		button.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent arg0) 
					{
					//System.out.println(dropdown.getSelectedItem());
					//System.out.println(dropdown.getSelectedIndex());
					name = txtfield.getText();
					System.out.println("Hello, " + name);
					}
				});
		frame.setVisible(true);

		}
	public static void askClass()
	
			{
			String[] preMadeArray = new String[] {"Druid", "Ranger", "Monk"}; 
			JButton button = new JButton("Enter");
			
			final JComboBox<String> dropdown = new JComboBox<String>(preMadeArray);
			final JLabel words = new JLabel("What is your class?");
			
			final JFrame frame = new JFrame("Class Selection");
			frame.setSize(400, 100);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			
			final JPanel panel = new JPanel();
			panel.setBackground(Color.red);
			frame.add(panel);
			panel.add(words);
			panel.add(dropdown);
			//panel.add(txtfield);
			panel.add(button);
			button.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent arg0) 
						{
						class = dropdown.getSelectedItem();
						//System.out.println(dropdown.getSelectedIndex());
						
						}
					});
			frame.setVisible(true);

			}
	}