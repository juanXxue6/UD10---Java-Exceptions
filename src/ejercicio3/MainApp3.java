package ejercicio3;


import java.util.Random;

import Ejercicio2.CustomExeption;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(999 - 0) + 0;
		
		try {
			if(a%2 == 0)		
			throw new CustomExeption(5); //exepcion custom que salta un par de la clase custom exeption del ejercicio anterior
			else
				throw new CustomExeption(6); //exepcion custom que salta un impar de la clase custom exeption del ejercicio anterior
		}catch (CustomExeption e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
