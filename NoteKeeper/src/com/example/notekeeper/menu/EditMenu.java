package com.example.notekeeper.menu;

import com.example.notekeeper.Frame;

public class EditMenu {
	/**
	 * Function to cut content using the "Cut" option
	 */
	public static void cut() {
		Frame.textArea.cut();
	}
	
	/**
	 * Function to copy content using the "Copy" option
	 */
	public static void copy() {
		Frame.textArea.copy();
	}
	
	/**
	 * Function to paste content after copying it using the "Paste" option
	 */
	public static void paste() {
		Frame.textArea.paste();
	}
	
	/**
	 * Function to select all content using the "Select All" option
	 */
	public static void selectAll() {
		Frame.textArea.selectAll();
	}
}
