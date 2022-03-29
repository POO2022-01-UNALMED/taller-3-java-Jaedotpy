package taller3.televisores;
public class TV {
	private Marca marca;
	public int canal;
	private int precio;
	public boolean estado;
	public int volumen;
	private Control control;
	private static int numTV = 0;
	
	// - Constructor -
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.canal = 1;
		this.precio = 500;
		this.estado = estado;
		this.volumen = 1;
		numTV ++;
	}
	
	// - Getters and Setters -
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	public static void setNumTV(int n) {
		numTV = n;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn(){
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	// - Methods - 
	
	public void canalUp(){
		if (this.estado = true) {
			if(this.canal != 120 && this.canal >= 1) {
				this.canal  = this.canal + 1;
			}			
		}		
	}
	
	public void canalDown(){
		if (this.estado = true) {
			if(this.canal != 1 && this.canal <= 120) {
				this.canal  = this.canal - 1;
			}			
		}		
	}
	
	public void volumenUp() {
		if (this.estado = true) {
			if(this.volumen != 7 && this.volumen >= 1) {
				this.volumen  = this.volumen + 1;
			}			
		}		
	}
	
	public void volumenDown() {
		if (this.estado = true) {
			if(this.volumen != 1 && this.volumen <= 7) {
				this.volumen  = this.volumen - 1;
			}			
		}		
	}	
}
