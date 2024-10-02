package com.example.notekeeper;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Frame {
	public static JFrame frame;
	public static JTextArea textArea;

	public static void main(String[] args) {
		createFrame();
		createTextArea();
		
		// Make the frame visible
		frame.setVisible(true);
	}

	/**
	 * Function to create frames for the application
	 */
	public static void createFrame() {
		// Create the frame
		frame = new JFrame("Note Keeper");
		
		// Set the size of the frame
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Function to create the text area
	 */
	public static void createTextArea() {
		// Create the text area and add it to the frame
		textArea = new JTextArea();
		frame.add(textArea);
		
		// Create the scroll bar and add it to the frame
		JScrollPane scrollBar = new JScrollPane(textArea);
		scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollBar.setBorder(BorderFactory.createEmptyBorder());
		frame.add(scrollBar);
	}
}
