package model;

public class Alfiere extends Pezzo{

	public Alfiere(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}
	
	/*private boolean occupatoAlf(int a, int b, Posto[][] h){
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
	}*/

	@Override
	public void movimento(Posto[][] h) {
		int Px=this.getX();
		int Py=this.getY();
		int a=Px;
		int b=Py;
		boolean stop=false;
		while(a>=0&&a<=7||b>=0 && b<=7|| !stop){
			a++;
			b++;
			if(h[a][b].occupato()){
				if(h[a][b].getPezzo().getColor()==this.getColor()){
					stop=true;
				}else{
					stop=true;
					h[a][b].setAvaiable(true);
				}
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px;
		b=Py;
		stop=false;
		while(a>=0&&a<=7||b>=0 && b<=7|| !stop){
			a++;
			b--;
			if(h[a][b].occupato()){
				if(h[a][b].getPezzo().getColor()==this.getColor()){
					stop=true;
				}else{
					stop=true;
					h[a][b].setAvaiable(true);
				}
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px;
		b=Py;
		stop=false;
		while(a>=0&&a<=7||b>=0 && b<=7|| !stop){
			a--;
			b--;
			if(h[a][b].occupato()){
				if(h[a][b].getPezzo().getColor()==this.getColor()){
					stop=true;
				}else{
					stop=true;
					h[a][b].setAvaiable(true);
				}
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px;
		b=Py;
		stop=false;
		while(a>=0&&a<=7||b>=0 && b<=7|| !stop){
			a--;
			b++;
			if(h[a][b].occupato()){
				if(h[a][b].getPezzo().getColor()==this.getColor()){
					stop=true;
				}else{
					stop=true;
					h[a][b].setAvaiable(true);
				}
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		
	}
	
	/*@Override
	public void movimento(int a, int b, Posto[][] h) {
		
		int Px=this.getX();
		int Py=this.getY();
		if((a<=7)&&(a>=0)&&(b<=7)&&(b>=0)){
			if((Px+a)/(Py+b)==1){
				if(h[Px][Py].getColor()==h[a][b].getColor()){
					if(!this.occupatoAlf(a, b, h)){
						if(h[a][b].occupato()){
							h[a][b].getPezzo().mangiato();
							h[Px][Py].getPezzo().setPos(a, b);
							
						}else{
							h[Px][Py].getPezzo().setPos(a, b);
							
						}	
					}
				}
			}
		}
		
	}*/

	
}
