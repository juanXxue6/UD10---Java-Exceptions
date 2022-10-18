import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp1 {

	static public Scanner sc = new Scanner(System.in);
	public static int Random() {
		
		return (int) ((Math.random() * (500 - 1)) + 1); 
	}
	
	
	public static void Juego() {
		
		int random = Random();
		int cont = 0;
		int numero = 0;
		boolean active = true;
		
		
		do {
			try {
			System.out.println("Introduce un numero entre el 1 o el 500");
			
			//numero = Integer.parseInt(sc.nextLine());
			numero = sc.nextInt();
			cont++;
			

				if(numero > random) {
					
					System.out.println("El numero es mas pequeño");
				}else if(numero < random) {
					System.out.println("El numero es mas grande");
				}else {
					System.out.println("Numero Acertado, intentos usados: " + cont);
					active = false;
				}
				
			}catch (InputMismatchException e) {
				System.err.println("Entrada no reconocida" + e);
				sc.next();

			}catch (NumberFormatException e) {
				System.err.println("Entrada no reconocida" + e);
			}
			
			
		}while(active);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Juego();
	}

}
