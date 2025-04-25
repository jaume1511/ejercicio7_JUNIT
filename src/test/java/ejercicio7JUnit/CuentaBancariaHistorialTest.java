package ejercicio7JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CuentaBancariaHistorialTest {

    private CuentaBancariaHistorial cuenta;

    @BeforeEach
    void setUp() {
        cuenta = new CuentaBancariaHistorial(1, "Jaume", 1000.0); // Asegúrate de usar double
    }

    /**
     * Comprobar que el movimiento del ingreso inicial se guarda bien
     */
    @Test
    void historial_IngresoInicial() {
        List<String> historial = cuenta.getHistorial();
        assertEquals(1, historial.size());
        assertTrue(historial.get(0).contains("Ingreso inicial de 1000.0"));
    }

    /**
     * Comprobar que se añade correctamente un deposito a una cuenta que
     * ya existe con un depósito inicial
     */
    @Test
    void historial_AddDepositoCorrecto() {
        cuenta.depositar(500.0);
        List<String> historial = cuenta.getHistorial();
        assertEquals(2, historial.size());
        assertTrue(historial.get(1).contains("Depósito de 500.0"));
    }

    /**
     * Comprobar que no se añade un movimiento si el deposito es negativo
     */
    @Test
    void historial_AddDepositoIncorrecto() {
        cuenta.depositar(-200.0); // Intento de depósito negativo
        List<String> historial = cuenta.getHistorial();
        assertEquals(1, historial.size()); // Solo el ingreso inicial
    }

    /**
     * Comprobar que se puede hacer un retiro de una cantidad correcta y 
     * se añade a los movimientos
     */
    @Test
    void historial_AddRetiroCorrecto() {
        cuenta.retirar(300.0);
        List<String> historial = cuenta.getHistorial();
        assertEquals(2, historial.size());
        assertTrue(historial.get(1).contains("Retiro de 300.0"));
    }

    /**
     * Comprobar que no se puede hacer un retiro de una cantidad negativa/incorrecta y 
     * no se añade a los movimientos
     */
    @Test
    void historial_AddRetiroIncorrecto() {
        cuenta.retirar(-100.0); // Intento de retiro negativo
        cuenta.retirar(2000.0); // Suponiendo que excede el saldo
        List<String> historial = cuenta.getHistorial();
        assertEquals(1, historial.size()); // Solo el ingreso inicial
    }
}
