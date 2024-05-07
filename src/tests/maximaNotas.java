package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class maximaNotas {

	@Test
	void maximaNotas1() {
		int [] array1 = {7, 8, 9, 6, 8};
		int maxima = misArrays.maximaNota(array1);
        assertEquals(9, maxima);
	}
	
	@Test
	void MaximaNotas2() {
		int [] array2 = {6, 4, 1, 9, 9};
		int maxima = misArrays.maximaNota(array2);
        assertEquals(9, maxima);


	}
	}
