package util;

import java.util.Arrays;

public abstract class misArrays {
	
	public static float mediaNotas(int [] resultados) {
	
	int suma = 0; 
	for (int nota : resultados) {
		suma = nota;
	}
	return (float) suma/resultados.length;
}
	public static void main(String[] args) {
		int[] notas = {6, 1, 4, 8, 9};
        System.out.println("La media es: " + mediaNotas(notas));
}
}
