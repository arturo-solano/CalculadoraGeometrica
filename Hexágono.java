/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterfaz;

public class Hexágono implements Figura {
    private final String color;
    private final double lado;

    public Hexágono(String color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }
}
