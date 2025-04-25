package ejercicio7JUnit;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancariaHistorial {
    private int numeroCuenta;
    private String titular;
    private double saldo;
    private List<String> historial;

    // Constructor que inicializa los valores de la cuenta
    public CuentaBancariaHistorial(int numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
        // Agregar ingreso inicial al historial
        historial.add("Ingreso inicial de " + saldoInicial);
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            historial.add("Depósito de " + cantidad);
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            historial.add("Retiro de " + cantidad);
        }
    }

    // Método para obtener el historial de movimientos
    public List<String> getHistorial() {
        return historial;
    }

    // Método para obtener el saldo actual de la cuenta
    public double getSaldo() {
        return saldo;
    }

    // Método para obtener el número de cuenta
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    // Método para obtener el titular de la cuenta
    public String getTitular() {
        return titular;
    }
}
