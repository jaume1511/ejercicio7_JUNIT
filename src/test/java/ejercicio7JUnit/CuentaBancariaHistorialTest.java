package ejercicio7JUnit;

import org.junit.jupiter.api.Test;

public class CuentaBancariaHistorialTest {
	
	/**
	 * Comprobar que el movimiento del ingreso inicial se guarda bien
	 */
	@Test
	void historial_IngresoInicial()
	{
		
	}
	
	/**
	 * Comprobar que se añade correctamente un deposito a una cuenta que
	 * ya existe con un depósito inicial
	 */
	@Test
	void historial_AddDepositoCorrecto()
	{
		
	}
	
	/**
	 * Comprobar que no se añade un movimiento si el deposito es negativo
	 */
	@Test
	void historial_AddDepositoIncorrecto()
	{
		
	}
	
	/**
	 * Comprobar que se puede hacer un retiro de una cantidad correcta y 
	 * se añade a los movimientos
	 */
	@Test
	void historial_AddRetiroCorrecto()
	{
		
	}
	
	/**
	 * Comprobar que no se puede hacer un retiro de una cantidad negativa/incorrecta y 
	 * no se añade a los movimientos
	 */
	@Test
	void historial_AddRetiroIncorrecto()
	{
		
	}
}
