package model;

public class Pedone extends Pezzo {
	

	public Pedone(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void movimento( Posto[][] h) {
		int Px=this.getX();
		int Py=this.getY();
		if(this.getColor()){//se è bianco
			h[Px][Py-1].setAvaiable(true);
			if(!this.getMoved() && !h[Px][Py-2].occupato()){
				h[Px][Py-2].setAvaiable(true);
			}
			if(h[Px+1][Py-1].occupato() && !h[Px+1][Py-1].getPezzo().getColor()){
				h[Px+1][Py-1].setAvaiable(true);
			}
			if(h[Px-1][Py-1].occupato() && !h[Px-1][Py-1].getPezzo().getColor()){
				h[Px-1][Py-1].setAvaiable(true);
			}
		}else{//se è nero
			h[Px][Py+1].setAvaiable(true);
			if(!this.getMoved() && !h[Px][Py+2].occupato()){
				h[Px][Py+2].setAvaiable(true);
			}
			if(h[Px+1][Py+1].occupato() && h[Px+1][Py+1].getPezzo().getColor()){
				h[Px+1][Py+1].setAvaiable(true);
			}
			if(h[Px-1][Py+1].occupato() && h[Px-1][Py+1].getPezzo().getColor()){
				h[Px-1][Py+1].setAvaiable(true);
			}
		}
		
	}
	
	//@Override
	/*public boolean movimento(int a, int b, Posto[][] h) { //manca controllo per il cambio pedina in se arrivato in fondo a tabellone
		int Px=this.getX();
		int Py=this.getY();
		
		if(this.getColor()){//per i bianchi
			if(this.mossoPedone()){
				if((b==Py-1)&&(a<=7)&&(a>=0)&&(a<=Px+1)&&(a>=Px-1)){
					if(a==Px){
						if(!h[a][b].occupato()){
							h[Px][Py].getPezzo().setPos(a, b);
							return true;
						}else{
							return false;//movimento non possibile
						}
					}else{
						if(!h[a][b].occupato()){
							h[a][b].getPezzo().mangiato();
							h[Px][Py].getPezzo().setPos(a, b);
							return true;
						}else{
							return false;//movimento non possibile
						}
					}
				}else{
					return false;//movimento non possibile
				}
			}else{
				if((b==Py-1)&&(a<=7)&&(a>=0)&&(a<=Px+1)&&(a>=Px-1)||(b==Py-2) ){
					
				}
			}
		}
		
		
		
		
		
		if(this.getColor()){ //per i bianchi
			if((b==Py-1)&&(a<=7)&&(a>=0)&&(a<=Px+1)&&(a>=Px-1)){
				if(a==Px){
					if(!h[a][b].occupato()){
						h[Px][Py].getPezzo().setPos(a, b);
						return true;
					}else{
						return false;//movimento non possibile
					}
				}else{
					if(!h[a][b].occupato()){
						h[a][b].getPezzo().mangiato();
						h[Px][Py].getPezzo().setPos(a, b);
						return true;
					}else{
						return false;//movimento non possibile
					}
				}
			}else{
				return false;//movimento non possibile
			}
		}else{ //per i neri
			if((b==Py+1)&&(a<=7)&&(a>=0)&&(a<=Px+1)&&(a>=Px-1)){
				if(a==Px){
					if(!h[a][b].occupato()){
						h[Px][Py].getPezzo().setPos(a, b);
						return true;
					}else{
						return false;//movimento non possibile
					}
				}else{
					if(!h[a][b].occupato()){
						h[Px][Py].getPezzo().setPos(a, b);
						return true;
					}else{
						return false;//movimento non possibile
					}
				}
			}else{
				return false;//movimento non possibile
			}
		}
	}*/		
}

