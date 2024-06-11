/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterfaz;

public class Rectángulo implements Figura {
    private final String color;
    private final double ancho, alto;

    public Rectángulo(String color, double ancho, double alto) {
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
