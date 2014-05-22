import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class JPanelDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;
 
	public static void main(String[] args)
		{
		final JFrame frame = new JFrame("JFrame Name");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
//		String[] preMadeArray = new String[] {"First Option", "Second Option", "Third Option"}; 
//		JButton button = new JButton("Enter");
//		final JComboBox<String> dropdown = new JComboBox<String>(preMadeArray);
//		final TextField txtfield = new TextField(20);
//		final JLabel words = new JLabel("Text");
		final JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		frame.add(panel);
		
		JButton button1 = new JButton(" ");
		JButton button2 = new JButton(" ");
		JButton button3 = new JButton(" ");
		JButton button4 = new JButton(" ");
		JButton button5 = new JButton(" ");
		JButton button6 = new JButton(" ");
		JButton button7 = new JButton(" ");
		JButton button8 = new JButton(" ");
		JButton button9 = new JButton(" ");
//		panel.add(words);
//		panel.add(dropdown);
//		panel.add(txtfield);
		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.NORTH);
		panel.add(button3, BorderLayout.NORTH);
		panel.add(button4, BorderLayout.CENTER);
		panel.add(button5, BorderLayout.CENTER);
		panel.add(button6, BorderLayout.CENTER);
		panel.add(button7, BorderLayout.SOUTH);
		panel.add(button8, BorderLayout.SOUTH);
		panel.add(button9, BorderLayout.SOUTH);
//		button.addActionListener(new ActionListener()
//			{
//			public void actionPerformed(ActionEvent arg0) 
//				{
//				System.out.println(dropdown.getSelectedItem());
////				System.out.println(dropdown.getSelectedIndex());
//				System.out.println(txtfield.getText());
//				}
//			});
		
		frame.setVisible(true);
		}
	}