package com.example.notekeeper.menu;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import com.example.notekeeper.Frame;

public class FileMenu {
	public static JFrame frame;
	public static String fileName;
	public static String filePath;
	public static String directory;
	
	/**
	 * Function to create a new file
	 */
	public static void newFile() {
		Frame.textArea.setText("");
		Frame.frame.setTitle("New");
	}
	
	/**
	 * Function to open and read a file
	 */
	public static void openFile() {
		FileDialog fileDialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
		fileDialog.setVisible(true);
		
		// Check if the user has selected a file
		if (fileDialog.getFile() != null) {
			directory = fileDialog.getDirectory();
			fileName = fileDialog.getFile();
			filePath = directory + fileName;
			Frame.frame.setTitle(fileName);
			
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				String line;
				Frame.textArea.setText("");
				
				// This while loop will iterate through a line that has no character on it 
				// It will append the line that was previously copied to the text area
				while ((line = reader.readLine()) != null) {
					Frame.textArea.append(line + "\n");
				}
			} catch (IOException e) {
				System.out.println("File not opened");
			}
		}
	}
}
