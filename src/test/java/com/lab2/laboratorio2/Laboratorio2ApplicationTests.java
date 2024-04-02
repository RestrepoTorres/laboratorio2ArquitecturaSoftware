package com.lab2.laboratorio2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Laboratorio2ApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health(){
		assertEquals("APPLICACION FUNCIONANDO OK",dataController.healthCheck());
	}

	@Test
	void version(){
		assertEquals("la version actual es 1.0.0",dataController.version());
	}

	@Test
	void nationsLength(){
		Integer nationsLenght = dataController.getRandomNations().size();
		assertEquals(20, nationsLenght);
	}
	@Test
	void currenciesLength(){
		Integer nationsLenght = dataController.getRandomCurrencies().size();
		assertEquals(20, nationsLenght);
	}
	@Test
	void airlinesLength(){
		Integer nationsLenght = dataController.getRandomAirlines().size();
		assertEquals(20, nationsLenght);
	}
	@Test
	void contextLoads() {
	}

}
