package ejercicio4;

public class Operaciones {

	private int num1;
	private int num2;
	
	
	Operaciones(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int Suma(int num1, int num2) {
		
		return num1+num2;
	}
	
	public int Resta(int num1, int num2) {
		
		return num1-num2;
	}
	
	public int Multiplicacion(int num1, int num2) {
		
		return num1*num2;
	}
	
	public int Division(int num1, int num2) {
		
		return num1/num2;
	}
	
	public int Potencia(double num1, double num2) {
		
		return (int) Math.pow(num1, num2);
	}
	
	public int Raiz2(int num1) {
		
		return (int) Math.sqrt(num1);
	}
	
	public int Raiz3(int num1) {
		
		return (int) Math.cbrt(num1);
	}
	
}
