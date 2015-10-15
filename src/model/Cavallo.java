package model;

public class Cavallo extends Pezzo {

	public Cavallo(int x, int y, boolean c) {
		super(x, y, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movimento(Posto[][] h) {
		int Px=this.getX();
		int Py=this.getY();
		int a,b;
		a=Px+1;
		b=Py+2;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px+2;
		b=Py+1;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px+1;
		b=Py-2;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px+2;
		b=Py-1;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px-1;
		b=Py-2;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px-2;
		b=Py-1;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px-2;
		b=Py+1;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}
		a=Px-1;
		b=Py+2;
		if((a>=0)&&(a<=7)&&(b>=0)&&(b<=7)){
			if(h[a][b].occupato()&&h[a][b].getPezzo().getColor()==this.getColor()){
				//do nothing
			}else{
				h[a][b].setAvaiable(true);
			}
		}	
	}

}
