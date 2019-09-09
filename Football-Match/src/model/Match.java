package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


import modelo.Match

public class Match {
	
	/**
	 * Relación que representa la lista del ObjetoMapa
	 */

	// ------------------------------
	// DECLARACIÓN DE CONSTANTES
	// ------------------------------

	/**
	 * Fondo del mapa del primer nivel
	 */
	public static final String FONDO_NIVEL_1 = "./recursos/Imagenes/bloques/FondoMapa.jpg";

	/**
	 * Ancho del mapa en pixeles
	 */
	public static final int ANCHO = 1300;

	/**
	 * Alto del mapa en pixeles
	 */
	public static final int ALTO = 700;

	private ObjetoMapa primerObjetoMapa;
	/**
	 * Relación que representa la clase Personaje
	 */
	private Personaje personaje;
	/**
	 * Relación que representa la lista de Enemigo
	 */
	private Enemigo primerEnemigo;

	/**
	 * Atributo que representa la cantidad de objetos
	 */
	private int cantidadObjetos;

	/**
	 * Atributo que representa la cantidad de enemigos
	 */
	private int cantidadEnemigos;

	/**
	 * Atributo que representa el nivel del Mapa
	 */
	private int nivel;

	/**
	 * Constructor de la clase Mapa. Se encarga de inicializar las relaciones y
	 * atributos de la clase.
	 */
	public Mapa() {
		primerObjetoMapa = null;
		primerEnemigo = null;
		cantidadObjetos = 0;
		cantidadEnemigos = 0;
		this.nivel = 1;
	}

	/**
	 * @return personaje
	 */
	public Personaje getDestroyer() {
		return personaje;
	}

	/**
	 * @param direccion
	 */
	public void mover(int direccion) {
		personaje.mover(direccion);
	}

	/**
	 * Metodo: Leer mapa Se encarga de leer un archivo de texto en el cual esta
	 * representado el mapa por medio de caracteres. Hace el llamado al metodo
	 * leerLineaDeMapa.
	 * 
	 * @throws IOException
	 */
	public void leerMapa() throws IOException {
		int contadorLineas = 0;
		BufferedReader br = new BufferedReader(new FileReader(new File("./recursos/mapas/nivel" + nivel + ".txt")));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			leerLineaDeMapa(line, contadorLineas);
			contadorLineas++;
		}
		br.close();
	}

	/**
	 * Metodo: LeerLineaDeMapa Se encarga de leer un String para identificar cada
	 * caracter que Hace el llamado al metodo leerCaracter.
	 * 
	 * @param line
	 *            : Linea que se va a leer
	 * @param contadorLineas:
	 */
	private void leerLineaDeMapa(String line, int contadorLineas) {
		for (int i = 0; i < line.length(); i++) {
			leerCaracter(line.charAt(i), i, contadorLineas);
		}
	}

	/**
	 * Metodo: LeerCaracter Se encarga de identificar que tipo de objeto esta
	 * representado por el caracter que entra por parametro.
	 * 
	 * @param c:
	 *            Caracter para identificar
	 * @param i:
	 *            identificador de posicion
	 * @param contadorLineas
	 */
	private void leerCaracter(char c, int i, int contadorLineas) {
		Imagen o = null;
		Random r = new Random();

		switch (c) {
		case 'B':
			o = new Bloque(i * Bloque.ANCHO, contadorLineas * Bloque.ALTO, Bloque.BLOQUE, cantidadObjetos);
			cantidadObjetos++;
			break;
		case 'M':
			o = new Bloque(i * Bloque.ANCHO, contadorLineas * Bloque.ALTO, Bloque.MESA, cantidadObjetos);
			cantidadObjetos++;
			break;
		case 'P':
			o = new Item(i * Item.ANCHO, contadorLineas * Item.ALTO, Item.Ruta + (r.nextInt(4) + 1) + ".png",
					cantidadObjetos, Item.MALETIN);
			cantidadObjetos++;

			break;
		case 'C':
			o = new Item(i * Item.ANCHO, contadorLineas * Item.ALTO, "imagen de un Item", cantidadObjetos, Item.COMIDA);
			cantidadObjetos++;
			break;
		case 'E':
			o = new Enemigo(i * 32, contadorLineas * 32, Enemigo.RUTA + (r.nextInt(1) + 1) + ".gif", cantidadEnemigos);
			cantidadEnemigos++;
			break;
		case '*':
			o = new Personaje(i * 32, contadorLineas * 32, Personaje.DESTROYER);
			break;
		}

		if (o != null) {
			if (o instanceof Bloque) {
				System.out.println("BLOQUE");
				agregarObjeto(primerObjetoMapa, (Bloque) o);
			}

			if (o instanceof Item) {
				System.out.println("ITEM");

				agregarObjeto(primerObjetoMapa, (Item) o);
			}
			if (o instanceof Personaje) {
				personaje = (Personaje) o;
			}
			if (o instanceof Enemigo) {
				agregarEnemigo(primerEnemigo, (Enemigo) o);
			}
		}
	}

}
