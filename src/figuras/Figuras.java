/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.logica.Cuadrado;

/**
 *
 * @author Estudiantes
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado();
        c.setLado(5);
        c.calcularArea();
        c.calcularPerimetro();
        System.out.println("El area cuadrada con lado=(" + c.getLado()+ ")="+ c.getArea());
        System.out.println("El perimetro con lado = (" + c.getLado() + ")=" + c.getPerimetro());
    }
    
}
