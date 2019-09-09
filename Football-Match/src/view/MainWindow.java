package view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private PanelField field;
	
	public MainWindow() {
		setPreferredSize(new Dimension(1000, 600));
		field = new PanelField();
		add(field);
		pack();
	}

	
	public static void main(String[] args) {
		MainWindow mw = new MainWindow();
		mw.setVisible(true);
		
	}
}

