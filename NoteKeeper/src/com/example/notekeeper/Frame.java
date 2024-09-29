package com.example.notekeeper;

import javax.swing.*;

public class Frame {
	public static JFrame frame;

	public static void main(String[] args) {
		createFrame();
		
		// Make the frame visible
		frame.setVisible(true);
	}

	/*
	 * Function to create frames for the application
	 */
	public static void createFrame() {
		frame = new JFrame("Note Keeper");
		
		// Set the size of the frame
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
