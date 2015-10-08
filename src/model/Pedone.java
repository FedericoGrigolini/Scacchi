package model;

public class Pedone extends Pezzo {

	public Pedone(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean movimento(int a, int b, Posto[][] h) { //manca controllo per il cambio pedina in se arrivato in fondo a tabellone
		int Px=this.getX();
		int Py=this.getY();
		
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
	}		
}

