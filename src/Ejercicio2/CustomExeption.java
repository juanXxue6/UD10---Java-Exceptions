package Ejercicio2;

public class CustomExeption extends Exception {
	
	private int code;

	public CustomExeption() {
	}
	
	public CustomExeption(int code) {
		this.code = code;
	}
	
	
	@Override
	public String getMessage() {
		
		switch (code) {
		case 1:
			
			return "Las letras no son validas";
			
		case 2:
			
			return "El numero introducido sale de los rangos establecidos";
			
		case 3:
			
			return "Datos no identificados";
			
		case 5:
			
			return "Numero Par";
			
		case 6:
			
			return "Numero Impar";

		default:
			return "Error desconocido";
			
		}
		
		
		
		
	}
}
