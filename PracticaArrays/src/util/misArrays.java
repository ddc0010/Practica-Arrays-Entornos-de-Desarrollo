package util;

import java.util.Arrays;

public abstract class misArrays {
	
	public static float mediaNotas(int [] resultado) {
		int suma = 0;
		for (int nota : resultado) {
			suma += nota;
		}
		return (float) suma/resultado.length;
	}
	public static void main(String[] args) {
        int[] notas = {5, 7, 9, 8, 8}; 
        System.out.println("La media es: " + mediaNotas(notas));

	

}
}
