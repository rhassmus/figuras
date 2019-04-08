/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.logica;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado {
    int lado;
    int area;
    int perimetro;
    

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }


    public int getPerimetro() {
        return perimetro;
    }

    
    public void calcularArea (){
        area=lado*lado;
    }
    
    public void calcularPerimetro(){
        perimetro = 4 * lado;
    }
}
