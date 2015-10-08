package model;

public class Alfiere extends Pezzo{

	public Alfiere(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}
	
	private boolean occupatoAlf(int a, int b, Posto[][] h){
		int Px=this.getX();
		int Py=this.getY();
		while(a!=Px&&b!=Py){
			if(a<Px){
				a++;
			}else{
				a--;
			}
			if(b<Py){
				b++;
			}else{
				b--;
			}
			if(h[a][b].occupato()){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean movimento(int a, int b, Posto[][] h) {
		
		int Px=this.getX();
		int Py=this.getY();
		if((a<=7)&&(a>=0)&&(b<=7)&&(b>=0)){
			if((Px+a)/(Py+b)==1){
				if(h[Px][Py].getColor()==h[a][b].getColor()){
					if(!this.occupatoAlf(a, b, h)){
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
			}
		}
		return false;
	}

	
}
