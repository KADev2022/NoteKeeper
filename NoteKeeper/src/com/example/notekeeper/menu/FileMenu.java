package com.example.notekeeper.menu;

import javax.swing.JFrame;

import com.example.notekeeper.Frame;

public class FileMenu {
	public static JFrame frame;
	
	/**
	 * Function to create a new file
	 */
	public static void newFile() {
		Frame.textArea.setText("");
		Frame.frame.setTitle("New");
	}
}
