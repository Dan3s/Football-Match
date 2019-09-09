package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelField extends JPanel{
	
	public PanelField() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		Dimension size = getSize();
		g.setColor(Color.DARK_GRAY);
		//Campo (fondo) cambiar ruta por ruta en el modelo, cambiar tamaños.
		g.drawImage(new ImageIcon("resources/images/field.png").getImage(), 0, 0, size.width, size.height, this);
		
		
		//Jugador, cambiar la ruta conectando con el controlador y modelo
		g.drawImage(new ImageIcon("resources/images/player.gif").getImage(), ((size.width/2))/2-25, (size.height/2)-25, 75, 75, this);
		
		//Balon, 
		g.drawImage(new ImageIcon("resources/images/ball.png").getImage(), (size.width/2)-15, (size.height/2)-15, 30, 30, this);
		
	}
	
	
	

}
