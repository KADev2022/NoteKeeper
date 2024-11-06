package com.example.notekeeper;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.example.notekeeper.menu.EditMenu;
import com.example.notekeeper.menu.FileMenu;
import com.example.notekeeper.menu.FormatMenu;

public class Frame {
	public static JFrame frame;
	public static JTextArea textArea;

	public static void main(String[] args) {
		createFrame();
		createTextArea();
		createMenu();
		
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
		frame.setSize(650, 650);
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
	
	/**
	 * Function to create the menu bar and menu items
	 */
	public static void createMenu() {
		// Create the menu bar and set it to the frame
		JMenuBar menu = new JMenuBar();
		frame.setJMenuBar(menu);
		
		/*
		 * Create 3 Menus
		 * 
		 * 1) File Menu
		 * 2) Edit Menu
		 * 3) Format Menu
		 */
		
		// File Menu
		JMenu fileMenu = new JMenu("File");
		menu.add(fileMenu);
		
		// Edit Menu
		JMenu editMenu = new JMenu("Edit");
		menu.add(editMenu);
		
		// Format Menu
		JMenu formatMenu = new JMenu("Format");
		menu.add(formatMenu);
		
		/*
		 * Create 4 File Menu Items
		 * 
		 * 1) New Item
		 * 2) Open Item
		 * 3) Save Item
		 * 4) Save As Item
		 */
		
		// New Item
		JMenuItem newItem = new JMenuItem("New");
		newItem.addActionListener(e -> FileMenu.newFile());
		fileMenu.add(newItem);
		
		// Open Item
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(e -> FileMenu.openFile());
		fileMenu.add(openItem);
		
		// Save Item
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.addActionListener(e -> FileMenu.saveFile());
		fileMenu.add(saveItem);
		
		// Save As Item
		JMenuItem saveAsItem = new JMenuItem("Save As...");
		saveAsItem.addActionListener(e -> FileMenu.saveAsFile());
		fileMenu.add(saveAsItem);
		
		/*
		 * Create 4 Edit Menu Items
		 * 
		 * 1) Cut Item
		 * 2) Copy Item
		 * 3) Paste Item
		 * 4) Select All Item
		 */
		
		// Cut Item
		JMenuItem cutItem = new JMenuItem("Cut");
		cutItem.addActionListener(e -> EditMenu.cut());
		editMenu.add(cutItem);
		
		// Copy Item
		JMenuItem copyItem = new JMenuItem("Copy");
		copyItem.addActionListener(e -> EditMenu.copy());
		editMenu.add(copyItem);
		
		// Paste Item
		JMenuItem pasteItem = new JMenuItem("Paste");
		pasteItem.addActionListener(e -> EditMenu.paste());
		editMenu.add(pasteItem);
		
		// Select All Item
		JMenuItem selectItem = new JMenuItem("Select All");
		selectItem.addActionListener(e -> EditMenu.selectAll());
		editMenu.add(selectItem);
		
		/*
		 * Create 3 Format Menu Items
		 * 
		 * 1) Bold Item
		 * 2) Italic Item
		 * 3) Font Color Item
		 */
		
		// Bold Item
		JMenuItem boldItem = new JMenuItem("Bold");
		boldItem.addActionListener(e -> FormatMenu.bold());
		formatMenu.add(boldItem);
		
		// Italic Item
		JMenuItem italicItem = new JMenuItem("Italic");
		italicItem.addActionListener(e -> FormatMenu.italic());
		formatMenu.add(italicItem);
		
		// Font Color Item
		JMenuItem fontColorItem = new JMenuItem("Font Color");
		fontColorItem.addActionListener(e -> FormatMenu.fontColor());
		formatMenu.add(fontColorItem);
	}
}
