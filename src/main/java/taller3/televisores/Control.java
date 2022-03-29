package taller3.televisores;

public class Control {
	TV tv;
	
	// - Getters and Setters -
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	// - Methods - 
	
	public void turnOn(){
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void canalUp(){
		if (tv.estado = true) {
			if(tv.canal != 120 && tv.canal >= 1) {
				tv.canal  = tv.canal + 1;
			}			
		}		
	}
	
	public void canalDown(){
		if (tv.estado = true) {
			if(tv.canal != 1 && tv.canal <= 120) {
				tv.canal  = tv.canal - 1;
			}			
		}		
	}
	
	public void volumenUp() {
		if (tv.estado = true) {
			if(tv.volumen != 7 && tv.volumen >= 1) {
				tv.volumen  = tv.volumen + 1;
			}			
		}		
	}
	
	public void volumenDown() {
		if (tv.estado = true) {
			if(tv.volumen != 1 && tv.volumen <= 7) {
				tv.volumen  = tv.volumen - 1;
			}			
		}		
	}
	
	public void setCanal(int canal) {
		if (tv.estado = true) {
			if (canal <= 120 && canal >= 1) {
				tv.canal = canal;
			}
			else if(canal > 120){
				tv.canal = 2;
			}
		}
	}
	
	public void enlazar(TV tvEnlazado) {
		this.tv = tvEnlazado;
	}
	
}
