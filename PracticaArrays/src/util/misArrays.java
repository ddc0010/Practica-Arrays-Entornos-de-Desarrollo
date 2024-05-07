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

	public static float medianaNotas(int [] resultado){
		Arrays.sort(resultado);
		int num = resultado.length;
		if (num %2 == 0)
			return (float) (resultado[num/2] + resultado[num/2-1])/2;
		return (float)(resultado[num/2] + resultado[num/2-1])/2 ;
		}
	
	public static void main(String[] args) {
        int[] notas = {5, 7, 9, 8, 8}; 
        System.out.println("La media es: " + mediaNotas(notas));

	

}
}
