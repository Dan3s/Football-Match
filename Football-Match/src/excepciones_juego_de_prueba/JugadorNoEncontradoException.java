package excepciones_juego_de_prueba;

public class JugadorNoEncontradoException extends Exception{

	private String jugadorNoEncontrado;

	public JugadorNoEncontradoException(String jugadorNoEncontrado) {
		this.jugadorNoEncontrado = jugadorNoEncontrado;
		
	}
	
	
	
	
}
