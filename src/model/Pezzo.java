package model;

abstract public class Pezzo {
	
	private int x;
	private int y;
	private boolean colore; // false nero true bianco
	private boolean mangiato; // false vivo true mangiato
	private boolean moved; // true, è già stato mosso una volta.
	
	public Pezzo(int x,int y,boolean c){
		this.x=x;
		this.y=y;
		this.colore=c;
		this.mangiato=false;
		this.moved=false;
	}
	
	public boolean getMoved(){
		return this.moved;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public boolean getColor(){
		return this.colore;
	}
	public boolean getEaten(){
		return this.mangiato;
	}
	
	public void setPos(int a,int b){
		this.x=a;
		this.y=b;
	}
	
	public void setMangiato(){
		this.mangiato=true;
	}
	
	abstract public void movimento(Posto[][] h); 
}
