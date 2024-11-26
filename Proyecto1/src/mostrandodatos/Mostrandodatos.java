package mostrandodatos;

import java.util.Scanner;

public class Mostrandodatos {

	public static void main(String[] args) {
		Scanner buenas = new Scanner(System.in);
		
		System.out.print("Ingresa un nombre: ");
		String nombre = buenas.nextLine(); 
		System.out.print("Ingresa un apellido: ");
		String apellido = buenas.nextLine();
		System.out.println(nombre  + " " + apellido);
		buenas.close();

	}

}
