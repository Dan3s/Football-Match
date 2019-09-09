package model;

public class Player {
	
	/**
	 * Constante que representa el ancho del personaje
	 */
	public final static int ANCHO = 32;

	/**
	 * Constante que representa el alto del personaje
	 */
	public final static int ALTO = 40;

	/**
	 * Constante que representa la ruta de la imagen del personaje
	 */
	public final static String DESTROYER = "./recursos/Imagenes/personajes/pika.gif";

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

	private String nickName;
	private int puntos;

	/**
	 * @param posicionX
	 * @param posicionY
	 * @param rutaImagen
	 * @param detenido
	 */
	public Player(int posicionX, int posicionY, String DESTROYER) {
		
		mueveArriba = false;
		mueveAbajo = false;
		mueveIzquierda = false;
		mueveDerecha = false;

		

		
		puntos = 0;
		
	}

	
	public void sumarPuntos() {
		puntos = puntos + 3;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
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
