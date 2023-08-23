/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Circulo;

/**
 *
 * @author Iamile
 */

public class Circulo {
    private double radio;  // Atributo privado para el radio del círculo
    private String color;  // Atributo privado para el color del círculo

    // Constructor predeterminado
    public Circulo() {
        radio = 5.0;
        color = "azul";
    }

    // Constructor sobrecargado
    public Circulo(double radio) {
        this.radio = radio;
        color = "azul";
    }

    // Método público para obtener el radio
    public double getRadio() {
        return radio;
    }

    // Método público para calcular y obtener el área
    public double getArea() {
        return Math.PI * radio * radio;
    }

    // Método toString() para obtener una representación en cadena del objeto
    @Override
    public String toString() {
        return "Círculo [radio=" + radio + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        // Utilizando el constructor por defecto
        Circulo c1 = new Circulo();
        System.out.println("Radio del círculo (por defecto): " + c1.getRadio());
        System.out.println("Área del círculo (por defecto): " + c1.getArea());

        // Utilizando el constructor sobrecargado
        Circulo c2 = new Circulo(6);
        System.out.println("Radio del círculo (radio = 6): " + c2.getRadio());
        System.out.println("Área del círculo (radio = 6): " + c2.getArea());
    }
}
