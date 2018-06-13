package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import models.Manager;
import views.MainWindow;

public class Controller implements ActionListener{

	private Manager manager;
	private MainWindow mainWindow;
	
	public Controller() {
		manager = new Manager();
		mainWindow = new MainWindow(this);
		int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de nodos"));
		mainWindow.setVisible(true);
		generateInformation(number);
	}

	private void generateInformation(int number) {
		for (int i = 1; i <= number; i++) {
			manager.addNode(Manager.createNode(String.valueOf(i), 0, 0));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Events.valueOf(e.getActionCommand())) {
		}
	}
}