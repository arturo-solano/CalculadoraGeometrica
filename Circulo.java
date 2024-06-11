/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterfaz;

public class Circulo implements Figura {
    private final String color;
    private final double radio;

    public Circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
