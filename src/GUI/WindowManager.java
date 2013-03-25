package GUI;
//package components;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;
import java.util.Random;







//create a simple GUI
public class WindowManager {

	
	
	protected static ImageIcon createImageIcon(String path) {
	
		java.net.URL imgURL = WindowManager.class.getResource(path);

		if (imgURL != null) {

			return new ImageIcon(imgURL);
		} 

		else {

			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
	
	private static void WindowManager() {

		JFrame frame = new JFrame("Connect Four v0.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(800, 600);
		
		int xPos = frame.getBounds().x;
		int yPos = frame.getBounds().y;
		ImageIcon icon = createImageIcon("images/c4-print.jpg");
		
		JLabel banner =  new JLabel(icon);
		
		banner.setBounds(xPos, yPos, 800, 600);
		
		frame.getContentPane().add(banner);
		
		JLabel labelButton = new JLabel();
		JButton startButton = new JButton("Start");
		startButton.setSize(100, 50);
		labelButton.add(startButton);
		labelButton.setBounds(xPos +50 , yPos +50, 100, 50);
		
		frame.getContentPane().add(labelButton);
		//Display the window
		
		frame.setVisible(true);
	}
	

	public static void main(String[] args) {
				WindowManager();
				
        
    }
	
	
	public static int randomCoin(){
		
		int ran=0;
		
		Random coin = new Random();
		
		ran = coin.nextInt(2);
		
		return ran;
	}
	
}
