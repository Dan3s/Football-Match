package model;

public class Player implements Movable{
	
	/**
	 * Constante que representa el ancho del personaje
	 */
	public final static int ANCHO = 50;

	/**
	 * Constante que representa el alto del personaje
	 */
	public final static int ALTO = 50;

	/**
	 * Constante que representa la ruta de la imagen del personaje
	 */
	public final static String PLAYER_IMAGE = "./resources/images/player.gif";

	/**
	 * Atributo que representa el movimiento hacia arriba del personaje
	 */
	private boolean mueveArriba;
	/**
	 * Atributo que representa el movimiento hacia abajo del personaje
	 */
	private boolean mueveAbajo;
	/**
	 * Atributo que representa el movimiento hacia la izquierda del personaje
	 */
	private boolean mueveIzquierda;
	/**
	 * Atributo que representa el movimiento hacia la derecha del personaje
	 */
	private boolean mueveDerecha;
	/**
	 * Atributo que representa la relación raizHabilidades con la clase Habilidades
	 */
	
	/**
	 * Atributo que representa la posicion x de la imagen
	 */
	protected int posicionX;
	/**
	 * Atributo que representa la posicion y de la imagen
	 */
	protected int posicionY;
	/**
	 * Atributo que representa la ruta de la iamgen
	 */
	protected String rutaImagen;

	private String number;
	private int goals;
	private int distanceTraveled;
	private boolean color;

	/**
	 * @param posicionX
	 * @param posicionY
	 * @param rutaImagen
	 * @param detenido
	 */
	public Player(int posicionX, int posicionY, String image) {
		
		mueveArriba = false;
		mueveAbajo = false;
		mueveIzquierda = false;
		mueveDerecha = false;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.rutaImagen = image;
		

		
		goals = 0;
		
	}
	
	/**
	 * @return posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}

	/**
	 * @return posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * @param posicionX
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	/**
	 * @param posicionY
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	
	public void sumarPuntos() {
		goals = goals + 1;
	}

	public int getPuntos() {
		return goals;
	}

	public void setPuntos(int puntos) {
		this.goals = puntos;
	}

	
	/**
	 * @return mueveArriba
	 */
	public boolean isMueveArriba() {
		return mueveArriba;
	}

	/**
	 * @param mueveArriba
	 */
	public void setMueveArriba(boolean mueveArriba) {
		this.mueveArriba = mueveArriba;
	}

	/**
	 * @return muevaAbajo
	 */
	public boolean isMueveAbajo() {
		return mueveAbajo;
	}

	/**
	 * @param mueveAbajo
	 */
	public void setMueveAbajo(boolean mueveAbajo) {
		this.mueveAbajo = mueveAbajo;
	}

	/**
	 * @return mueveIzquierda
	 */
	public boolean isMueveIzquierda() {
		return mueveIzquierda;
	}

	/**
	 * @param mueveIzquierda
	 */
	public void setMueveIzquierda(boolean mueveIzquierda) {
		this.mueveIzquierda = mueveIzquierda;
	}

	/**
	 * @return mueveDerecha
	 */
	public boolean isMueveDerecha() {
		return mueveDerecha;
	}

	/**
	 * @param mueveDerecha
	 */
	public void setMueveDerecha(boolean mueveDerecha) {
		this.mueveDerecha = mueveDerecha;
	}


	@Override
	public void moveRight(int valor) {
		// TODO Auto-generated method stub
		posicionX += valor;
	}


	@Override
	public void moveLeft(int valor) {
		// TODO Auto-generated method stub
		posicionX -= valor;
	}


	@Override
	public void moveUp(int valor) {
		// TODO Auto-generated method stub
		posicionY -= valor;
	}


	@Override
	public void moveDown(int valor) {
		// TODO Auto-generated method stub
		posicionY += valor;
	}


	@Override
	public void move(int direccion) {
		// TODO Auto-generated method stub
		if (direccion == 1) {
			moveLeft(DISTANCIA_QUE_SE_MUEVE_1);
			actualDirection(1);
		}
		if (direccion == 2) {
			moveRight(DISTANCIA_QUE_SE_MUEVE_1);
			actualDirection(2);
		}
		if (direccion == 3) {
			moveUp(DISTANCIA_QUE_SE_MUEVE_1);
			actualDirection(3);
		}
		if (direccion == 4) {
			moveDown(DISTANCIA_QUE_SE_MUEVE_1);
			actualDirection(4);
		}
	}


	@Override
	public void push() {
		// TODO Auto-generated method stub
		if (mueveArriba) {
			moveDown(1);
		}
		if (mueveAbajo) {
			moveUp(1);
		}
		if (mueveDerecha) {
			moveLeft(1);
		}
		if (mueveIzquierda) {
			moveRight(1);
		}
	}


	@Override
	public void actualDirection(int dire) {
		// TODO Auto-generated method stub
		switch (dire) {
		case 1:
			setMueveIzquierda(true);
			setMueveDerecha(false);
			setMueveArriba(false);
			setMueveAbajo(false);
			break;
		case 2:
			setMueveDerecha(true);
			setMueveIzquierda(false);
			setMueveAbajo(false);
			setMueveArriba(false);
			break;
		case 3:
			setMueveArriba(true);
			setMueveDerecha(false);
			setMueveIzquierda(false);
			setMueveAbajo(false);
			break;
		case 4:
			setMueveAbajo(true);
			setMueveArriba(false);
			setMueveDerecha(false);
			setMueveIzquierda(false);
			break;
		}
	}


	/**
	 * Nombre: moverDerecha. El metodo se encarga de aumentar la posicion del eje x
	 * del personaje
	 * 
	 * @param valor
	 */
	
//	public void moverDerecha(int valor) {
//		posicionX += valor;
//
//	}
//
//	/**
//	 * Nombre: moverIzquierda. El metodo se encarga de disminuir la posicion del eje
//	 * x del personaje
//	 * 
//	 * @param valor
//	 */
//	@Override
//	public void moverIzquierda(int valor) {
//		posicionX -= valor;
//	}
//
//	/**
//	 * Nombre: moverArriba. El metodo se encarga de disminuir la posicion del eje y
//	 * del personaje
//	 * 
//	 * @param valor
//	 */
//	@Override
//	public void moverArriba(int valor) {
//		posicionY -= valor;
//	}
//
//	/**
//	 * Nombre: moverAbajo. El metodo se encarga de aumentar la posicion del eje y
//	 * del personaje
//	 * 
//	 * @param valor
//	 */
//	@Override
//	public void moverAbajo(int valor) {
//		posicionY += valor;
//	}
//
//	/**
//	 * Nombre: mover. El metodo se encarga de modificar la posicion del personaje
//	 * dado numero que entra por parámetro
//	 * 
//	 * @param dirección
//	 *            - valor que indica que posición del personaje se quiere mover.
//	 * 
//	 *            <b>pre</b> El método ha modificado la posición del personaje.
//	 *            <b>pos</b> El personaje ha cambiado su movimiento actual.
//	 */
//	@Override
//	public void mover(int direccion) {
//
//		if (direccion == 1) {
//			moverIzquierda(DISTANCIA_QUE_SE_MUEVE_1);
//			direccionActual(1);
//		}
//		if (direccion == 2) {
//			moverDerecha(DISTANCIA_QUE_SE_MUEVE_1);
//			direccionActual(2);
//		}
//		if (direccion == 3) {
//			moverArriba(DISTANCIA_QUE_SE_MUEVE_1);
//			direccionActual(3);
//		}
//		if (direccion == 4) {
//			moverAbajo(DISTANCIA_QUE_SE_MUEVE_1);
//			direccionActual(4);
//		}
//	}
//
//	/**
//	 * Nombre: empujar. El método se encarga de modificar la posicion del personaje
//	 * 
//	 * <b>pre</b> El método ha modificado la posición del personaje.
//	 * 
//	 * <b>pos</b> El personaje ha cambiado su movimiento actual.
//	 */
//	@Override
//	public void empujar() {
//		if (mueveArriba) {
//			moverAbajo(1);
//		}
//		if (mueveAbajo) {
//			moverArriba(1);
//		}
//		if (mueveDerecha) {
//			moverIzquierda(1);
//		}
//		if (mueveIzquierda) {
//			moverDerecha(1);
//		}
//	}
//
//	/**
//	 * Nombre: direccionActual. El método se encarga de modificar las posiciones
//	 * donde el personaje pueda moverse cuando lo obstruye algún elemento del mapa.
//	 * 
//	 * @param dire
//	 *            - valor que indica que posición del personaje se quiere modificar.
//	 *
//	 *            <b>pos</b> El método ha modificado las posiciones del personaje.
//	 */
//	@Override
//	public void direccionActual(int dire) {
//		switch (dire) {
//		case 1:
//			setMueveIzquierda(true);
//			setMueveDerecha(false);
//			setMueveArriba(false);
//			setMueveAbajo(false);
//			break;
//		case 2:
//			setMueveDerecha(true);
//			setMueveIzquierda(false);
//			setMueveAbajo(false);
//			setMueveArriba(false);
//			break;
//		case 3:
//			setMueveArriba(true);
//			setMueveDerecha(false);
//			setMueveIzquierda(false);
//			setMueveAbajo(false);
//			break;
//		case 4:
//			setMueveAbajo(true);
//			setMueveArriba(false);
//			setMueveDerecha(false);
//			setMueveIzquierda(false);
//			break;
//		}
//	}
//
//	public int darDireccionActual() {
//		if (mueveArriba) {
//			return DIRECCION_ARRIBA;
//		} else if (mueveAbajo) {
//			return DIRECCION_ABAJO;
//		} else if (mueveDerecha) {
//			return DIRECCION_DERECHA;
//		} else if (mueveIzquierda) {
//			return DIRECCION_IZQUIERDA;
//		} else {
//			return 0;
//		}
//
//	}

}
