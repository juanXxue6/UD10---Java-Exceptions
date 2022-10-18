package ejercicio5;

import java.util.Iterator;
import java.util.Random;

public class Password {

	private static final int LONGITUD_BASE = 8;
	
	private static final String CHARACTERS = "123QWERTYUIOPLKJHGFDSAMNB0456VCXZmnbvcxzlkjhgfdsa789poiuytrewq";
	
	
	private int longitud;
	private String contraseña;
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = PasswordGenerate();
	}

	public Password() {
		this.longitud = LONGITUD_BASE;
		this.contraseña = PasswordGenerate();
	}
	
	
	public String PasswordGenerate() {
		
	    Random random = new Random();
	    String password = "";
	    	
		for (int i = 0; i < longitud; i++) {
			int a = random.nextInt(CHARACTERS.length() - 0) + 0;
			password = password + Character.toString(CHARACTERS.charAt(a));
		}
		
		contraseña = password;
		return password;
	}
	
	
	
	public boolean IsStrong() {
		int mayusCont = 0;
		int minusCont = 0;
		int numberCont = 0;
		
		
		for (int i = 0; i < contraseña.length(); i++) {
			char aux = contraseña.charAt(i);
			
				if(Character.isUpperCase(aux))
					mayusCont++;
				else if(Character.isLowerCase(aux))
					minusCont++;
				else
					numberCont++;
		}
		if(mayusCont >= 2 && minusCont >= 1 && numberCont >= 5)
			return true;
		else
			return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	@Override
	public String toString() {
		return "La contraseña es " + getContraseña() + "\n" + "¿Es una contraseña fuerte? " + IsStrong();
	}

	
	
}
