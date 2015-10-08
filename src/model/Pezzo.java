package model;

abstract public class Pezzo {
	
	private int x;
	private int y;
	private boolean colore; // false nero true bianco
	private boolean eaten; // 0 vivo 1 mangiato
	
	public Pezzo(int x,int y,boolean c){
		this.x=x;
		this.y=y;
		this.colore=c;
		this.eaten=false;
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
		return this.eaten;
	}
	
	public void setPos(int a,int b){
		this.x=a;
		this.y=b;
	}
	
	public void mangiato(){
		this.eaten=true;
	}
	
	abstract public boolean movimento(int a,int b,Posto[][] h); 
}
