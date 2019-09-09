package model;

public interface Movable {
	
	public final static int DISTANCIA_QUE_SE_MUEVE_1 = 5;
	public final static int DISTANCIA_QUE_SE_MUEVE_2 = 1;
	public final static int DISTANCIA_QUE_SE_MUEVE_3 = 15;

	public final static int UP_DIRECTION = 3;
	public final static int DOWN_DIRECTION = 4;
	public final static int LEFT_DIRECTION = 1;
	public final static int RIGHT_DIRECTION = 2;

	public void moveRight(int valor);

	public void moveLeft(int valor);

	public void moveUp(int valor);

	public void moveDown(int valor);

	public void move(int direccion);

	public void push();

	public void actualDirection(int direccion);
	
	

	//public void mover();
}


