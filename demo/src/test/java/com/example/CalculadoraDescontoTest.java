package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraDescontoTest {

    @Test
    public void testarCompraAbaixoDe100() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double resultado = calculadora.calcularValorFinal(50.0);
        
        assertEquals(50.0, resultado);
    }

    @Test
    public void testarCompraComDescontoDe5Porcento() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double resultado = calculadora.calcularValorFinal(200.0);
        
        assertEquals(190.0, resultado);
    }

    @Test
    public void testarCompraComDescontoDe10Porcento() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double resultado = calculadora.calcularValorFinal(600.0);
        
        assertEquals(540.0, resultado);
    }

    @Test
    public void testarValoresLimite() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        
        double resultado100 = calculadora.calcularValorFinal(100.0);
        assertEquals(95.0, resultado100);

        double resultado500 = calculadora.calcularValorFinal(500.0);
        assertEquals(450.0, resultado500);
    }

    @Test
    public void testarValorNegativo() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        
            assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(-50.0);
        });
    }
}