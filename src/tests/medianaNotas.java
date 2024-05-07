package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class medianaNotas {

	@Test
	void medianaNotas1() {
       float NotasEspera = 3;
       int[] array1 = {1,2,3,4,5};
       float NotasObtiene = misArrays.medianaNotas(array1);
       assertEquals(NotasEspera, NotasObtiene);
    }
    
	@Test
	void medianaNotas2() {
       float NotasEspera = 5;
       int[] array2 = {6,7,8,9,5};
       float NotasObtiene = misArrays.medianaNotas(array2);
       assertEquals(NotasEspera, NotasObtiene);
    }

}
