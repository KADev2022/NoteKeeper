package com.example.notekeeper.menu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JColorChooser;

import com.example.notekeeper.Frame;

public class FormatMenu {
	/**
	 * Function to make the font bold using the "Bold" option
	 */
	public static void bold() {
		Font currentFont = Frame.textArea.getFont();
		Font boldFont = currentFont.deriveFont(Font.BOLD);
		Frame.textArea.setFont(boldFont);
	}
	
	/**
	 * Function to make the font italic using the "Italic" option
	 */
	public static void italic() {
		Font currentFont = Frame.textArea.getFont();
		Font italicFont = currentFont.deriveFont(Font.ITALIC);
		Frame.textArea.setFont(italicFont);
	}
	
	/**
	 * Function to choose font colour using the "Font Color" option
	 */
	public static void fontColor() {
		Color selectedColor = JColorChooser.showDialog(null, "Select Font Color", Color.BLACK);
		
		// If the colour is selected, then set the foreground to be that colour
		if (selectedColor != null) {
			Frame.textArea.setForeground(selectedColor);
		}
	}
}
