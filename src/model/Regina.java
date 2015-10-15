package model;

public class Regina extends Pezzo{

	public Regina(int x, int y, boolean c) {
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
		while(a<=7||!stop){ //inizio controllo movimento perpendicolare
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
		stop=false;
		b=Py; //fino controllo movimento perpendicolare
		
		while(a>=0&&a<=7||b>=0 && b<=7|| !stop){ //inizio controllo movimento diagonale
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
		}//fine controllo movimento diagonale
	}

}
