package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
	Scanner buenas = new Scanner(System.in);
	
	System.out.print("Ingresa un dato: ");
	int dato1 = buenas.nextInt();
	System.out.print("Ingresa un segundo dato: ");
	int dato2 = buenas.nextInt();
	System.out.println("La suma es " + (dato1 + dato2));
	buenas.close();

	}

}
