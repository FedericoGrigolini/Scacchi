package model;

public class Posto {
	
	private boolean colore;
	private boolean busy;
	private Pezzo occupante;
	
	public Posto(boolean c){
		colore=c;
		busy = false;
		occupante = null;
	}
	
	public boolean occupato(){
		return this.busy;
	}
	
	public Pezzo getPezzo(){
		return this.occupante;
	}
	
}
