package Ejercicio2;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			throw new CustomExeption(3);
		} catch (CustomExeption e) {
			System.out.println(e.getMessage());
		}
	}

}
