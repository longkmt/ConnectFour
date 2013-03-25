package GUI;

import javax.swing.*;
import javax.swing.table.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import gameBoard.*;

public class GameInterface extends Applet{
	
	private String[] colNames;
	
	public GameInterface(Board board){
		
//		JFrame frame1 = new JFrame();
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//        frame1.setSize(300, 150);
//        frame1.setVisible(true); 
        
		colNames = new String[board.getWidth()];
		for(int i = 0; i< colNames.length; i++)
		{
			colNames[i] = Integer.toString(i);
		}

		try {
	        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
	    } catch (UnsupportedLookAndFeelException ex) {
	        ex.printStackTrace();
	    } catch (IllegalAccessException ex) {
	        ex.printStackTrace();
	    } catch (InstantiationException ex) {
	        ex.printStackTrace();
	    } catch (ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }
	    /* Turn off metal's use of bold fonts */
	    UIManager.put("swing.boldMetal", Boolean.FALSE);
		  GridLayoutDemo frame = new GridLayoutDemo("GridLayoutDemo");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Set up the content pane.
	    frame.addComponentsToPane(frame.getContentPane());
	    //Display the window.
	    frame.pack();
	    frame.setVisible(true);
	}
}
