package com.example.notekeeper.menu;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

import com.example.notekeeper.Frame;

public class FileMenu {
	public static JFrame frame;
	public static String fileName;
	public static String filePath;
	public static String directory;
	
	/**
	 * Function to create a new file using the "New" option
	 */
	public static void newFile() {
		Frame.textArea.setText("");
		Frame.frame.setTitle("New");
	}
	
	/**
	 * Function to open and read a file using the "Open" option
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
			
			// Open and read the file
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				String line;
				Frame.textArea.setText("");
				
				/*
				 * This while loop will iterate through a line that has no character on it 
				 * It will append the line that was previously copied to the text area
				 */
				while ((line = reader.readLine()) != null) {
					Frame.textArea.append(line + "\n");
				}
			} catch (IOException e) {
				System.out.println("File not opened");
			}
		}
	}
	
	/**
	 * Function to save a new file using the "Save As" option
	 */
	public static void saveAsFile() {
		FileDialog fileDialog = new FileDialog(frame, "Save File", FileDialog.SAVE);
		fileDialog.setVisible(true);
		
		// Check if the user has selected a file
		if (fileDialog.getFile() != null) {
			directory = fileDialog.getDirectory();
			fileName = fileDialog.getFile();
			filePath = directory + fileName;
			Frame.frame.setTitle(fileName);
			
			// Save a new file if it does not have a name
			try {
				FileWriter writer = new FileWriter(filePath);
				writer.write(Frame.textArea.getText());
				writer.close();
			} catch (IOException e) {
				System.out.println("File cannot be saved");
			}
		}
	}
	
	/**
	 * Function to save an existing file using the "Save" option
	 */
	public static void saveFile() {
		/*
		 * If the file does not have a name, then use the "Save As" option
		 * Otherwise if it has a name, then the existing file will save the changes
		 */
		if (fileName == null) {
			saveAsFile();
		} else {
			// Save the file with the new changes
			try {
				FileWriter writer = new FileWriter(filePath);
				writer.write(Frame.textArea.getText());
				writer.close();
			} catch (IOException e) {
				System.out.println("File cannot be saved");
			}
		}
	}
}
