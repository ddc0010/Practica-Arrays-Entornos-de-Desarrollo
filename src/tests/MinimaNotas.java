package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class MinimaNotas {

	@Test
	void minimaNotas1() {
		int [] array1 = {7, 8, 9, 6, 8};
		int minima = misArrays.minimaNota(array1);
        assertEquals(9, minima);
	}
	
	@Test
	void minimaNotas2() {
		int [] array2 = {6, 4, 1, 9, 9};
		int minima = misArrays.minimaNota(array2);
        assertEquals(9, minima);



}
}
