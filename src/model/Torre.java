package model;

public class Torre extends Pezzo{

	public Torre(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}
	
	private boolean occupatoTorre(int a, int b, Posto[][] h) { 
		int Px=this.getX();
		int Py=this.getY();
		if(a==Px){
			while(b!=Py){
				if(b<Py){
					b++;
				}else{
					b--;
				}
				if(h[a][b].occupato()){
					return true;
				}
			}
		}else{
			while(a!=Px){
				if(a<Px){
					a++;
				}else{
					a--;
				}
				if(h[a][b].occupato()){
					return true;
				}
			}
		}	
		return false;
	}
	
	@Override
	public boolean movimento(int a, int b, Posto[][] h) {
		int Px=this.getX();
		int Py=this.getY();
		
		if(((Px==a)&&(Py<=7)&&(Py>=0))||(Py==b)&&(Px<=7)&&(Px>=0)){
			if(!this.occupatoTorre(a, b, h)){
				if(h[a][b].occupato()){
					h[a][b].getPezzo().mangiato();
					h[Px][Py].getPezzo().setPos(a, b);
					return true;
				}else{
					h[Px][Py].getPezzo().setPos(a, b);
					return true;
				}	
			}
		}
		return false;
	}

}
