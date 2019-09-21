package hilos_juego_de_prueba;

import javax.swing.ImageIcon;

import interfaz_juego_de_prueba.Principal;
import modelo_juego_de_prueba.Personaje;

public class MoverImagen extends Thread{

	
	private Principal principal;

	private boolean mover = true;
	
	
	public MoverImagen(Principal principal) {
		this.principal = principal;
		
	}
	
	public void run () {

		while(mover)
		{
			try {
				principal.pintarImagen();
				Thread.sleep(59);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void parar() {
		
		mover = false ;
	}
	
	
}
