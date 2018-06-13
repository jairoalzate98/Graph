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
		int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de nodos"));
		mainWindow = new MainWindow(this, number);
		mainWindow.setVisible(true);
		generateInformation(number);
		mainWindow.setListPanel(manager.getNodeList());
	}

	private void generateInformation(int number) {
		int width = (mainWindow.getWidth() / 2) - 40;
		int height = mainWindow.getHeight();
		int up = 0;
		int down = 0;
		if ((number % 2) == 0) {
			up = number / 2;
			down = number / 2;
		} else {
			up = (number / 2) + 1;
			down = number / 2;
		}
		int numberUp = width / up;
		int numberDown = width / down;
		int posXUp = 40; 
		int posXDown = 40; 
		for (int i = 1; i <= number; i++) {
			if (i <= up) {
				manager.addNode(Manager.createNode(String.valueOf(i), posXUp, 40));
				posXUp += numberUp;
			} else {
				manager.addNode(Manager.createNode(String.valueOf(i), posXDown, height - 160));
				posXDown += numberDown;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Events.valueOf(e.getActionCommand())) {
		}
	}
}