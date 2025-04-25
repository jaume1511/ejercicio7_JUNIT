package ejercicio7JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {
	CuentaBancaria cuenta;
	
	@BeforeEach
	public void init()
	{
		cuenta = new CuentaBancaria(100);
	}
	
	@Test
	public void crearCuenta_ConSaldoInicialPositivo()
	{
		assertEquals(100, cuenta.getSaldo());
	}
	
	@Test
	public void crearCuenta_ConSaldoInicialNegativo()
	{
		CuentaBancaria cuenta = new CuentaBancaria(-100);
		assertEquals(0, cuenta.getSaldo());
	}
	
	@Test
    void depositar_CantidadPositiva() {
        boolean resultado = cuenta.depositar(25.0);
        assertTrue(resultado);
        assertEquals(125, cuenta.getSaldo());
    }

	@Test
    void depositar_CantidadNegativa() {
        boolean resultado = cuenta.depositar(-25);
        assertFalse(resultado);
        assertEquals(100, cuenta.getSaldo());
    }
	
	@Test
    void retirar_CantidadValida() {
        boolean resultado = cuenta.retirar(40.0);
        assertTrue(resultado);
        assertEquals(60.0, cuenta.getSaldo());
    }
	
	 @Test
    void retirar_CantidadMayorQueSaldo() {
        boolean resultado = cuenta.retirar(125);
        assertFalse(resultado);
        assertEquals(100, cuenta.getSaldo());
    }

    @Test
    void retirar_CantidadNegativa() {
        boolean resultado = cuenta.retirar(-25);
        assertFalse(resultado);
        assertEquals(100, cuenta.getSaldo());
    }
//a
}
