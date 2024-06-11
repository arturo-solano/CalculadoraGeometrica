/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterfaz;

public class Main {
    public static void main(String[] args) {
        Figura hexagono = new Hexágono("rojo", 5);
        System.out.println("Hexágono:");
        System.out.println("Color: " + hexagono.getColor());
        System.out.println("Perímetro: " + hexagono.calcularPerimetro());
        System.out.println("Área: " + hexagono.calcularArea());
        System.out.println();

        Figura triangulo = new Triángulo("azul", 3, 4, 5);
        System.out.println("Triángulo:");
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println();

        Figura rectangulo = new Rectángulo("verde", 4, 6);
        System.out.println("Rectángulo:");
        System.out.println("Color: " + rectangulo.getColor());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println();

        Figura circulo = new Circulo("amarillo", 7);
        System.out.println("Círculo:");
        System.out.println("Color: " + circulo.getColor());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println();
    }
}
