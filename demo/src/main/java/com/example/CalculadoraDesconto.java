package com.example;

public class CalculadoraDesconto {

    public double calcularValorFinal(double valorCompra) {
        
        if (valorCompra < 0) {
            throw new IllegalArgumentException("O valor da compra não pode ser negativo.");
        }

        double valorFinal = 0.0;

        if (valorCompra < 100.0) {
            valorFinal = valorCompra; // Sem desconto
            
        } else if (valorCompra < 500.0) {
            valorFinal = valorCompra - (valorCompra * 0.05); // 5% de desconto
            
        } else {
            valorFinal = valorCompra - (valorCompra * 0.10); // 10% de desconto
        }

        return valorFinal;
    }
}