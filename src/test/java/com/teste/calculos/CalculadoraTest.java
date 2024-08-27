package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 6.3 + 5 = 11.3")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 6.3D;
		double valor2 = 5D;
		double esperado = 11.3D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "6.3 + 5 não gerou o valor 11.3");
	}
	
	@Test
	@DisplayName("Teste 15 - 5 = 10")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 15D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "15 - 5 não gerou o valor 10");
	}
	
	@Test
	@DisplayName("Teste 21 / 3 = 7")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 21D;
		double valor2 = 3D;
		double esperado = 7D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "21 / 3 não gerou o valor 7");
	}
	
	@Test
	@DisplayName("Teste 6 * 6 = 36")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 6D;
		double valor2 = 6D;
		double esperado = 36D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "6 * 6 não gerou o valor 36");
	}
}
