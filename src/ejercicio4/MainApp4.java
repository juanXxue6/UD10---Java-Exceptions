package ejercicio4;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class MainApp4 {

	static public Scanner sc = new Scanner(System.in);
	static int a = 0;
	static int b = 0;
	static Operaciones op;
	static boolean exec = true;
	
	public static void LlenarNumeros() {
		
		try {
		System.out.println("Numero uno");
		a = Integer.parseInt(sc.next());
		
		System.out.println("Numero dos");
		b = Integer.parseInt(sc.next());
		}catch (NumberFormatException e) {
			System.err.println(e);
			exec = false;
		}
		
		op = new Operaciones(a,b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String operacion = "";
		do {
		System.out.println("Selecciona la operacion");
		operacion = sc.next().toLowerCase();
		
		if(!operacion.equals("salir"))
		LlenarNumeros();
		
		try {
			switch (operacion) {
			
			case "suma":
				
				System.out.println(op.Suma(a, b));			
				break;
				
			case "resta":
				
				System.out.println(op.Resta(a, b));
				break;
				
			case "multiplicacion":
				
				System.out.println(op.Multiplicacion(a, b));
				break;
				
			case "division":
				
				System.out.println(op.Division(a, b));
				
			
				break;
				
			case "potencia":
				
				System.out.println(op.Potencia(a, b));
				break;
				
			case "raiz":
				
				System.out.println(op.Raiz2(a));
				break;
				
			case "raiz3":
				
				System.out.println(op.Raiz3(a));
				break;
				
			case "salir":
				
				exec = false;
				break;
	
			default:
				break;
			}
		
		}catch (NumberFormatException e) {
			System.err.println(e);
			exec = false;
			
		}catch (ArithmeticException e) {
			System.err.println(e);
			exec = false;
			}
		
		catch (Exception e) {
			System.err.println(e);
			exec = false;
			}
		}while(exec);
		
	}

}
