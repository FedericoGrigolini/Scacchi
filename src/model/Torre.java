package model;

public class Torre extends Pezzo{

	public Torre(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movimento(Posto[][] h) {
		int Px=this.getX();
		int Py=this.getY();
		int a=Px;
		int b=Py;
		boolean stop=false;
		while(a<=7||!stop){
			a++;
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
		stop=false;
		a=Px;
		while(a>=0||!stop){
			a--;
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
		stop=false;
		a=Px;
		while(b<=7||!stop){
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
		stop=false;
		b=Py;
		while(b>=0||!stop){
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
	}
	
	/*private boolean occupatoTorre(int a, int b, Posto[][] h) { 
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
	}*/
	
	/*@Override
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
	}*/

}
