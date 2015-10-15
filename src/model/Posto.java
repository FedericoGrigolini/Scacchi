package model;

public class Posto {
	
	private boolean colore;
	private boolean busy;
	private Pezzo occupante;
	private boolean avaiable;
	
	public Posto(boolean c){
		colore=c;
		busy = false;
		occupante = null;
	}
	
	public boolean occupato(){
		return this.busy;
	}
	public void occupa(Pezzo p){
		this.occupante=p;
	}
	public boolean getAvaiable(){
		return this.avaiable;
	}
	public void setAvaiable(boolean a){
		this.avaiable=a;
	}
	public boolean getColor(){
		return this.colore;
	}
	
	public Pezzo getPezzo(){
		return this.occupante;
	}
	
}
