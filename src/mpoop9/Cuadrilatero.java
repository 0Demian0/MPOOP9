/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *
 * @author A2
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a,b;
    private float base,altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public float area() {
        return base*altura;
    }

    @Override
    public float perimetro() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + '}';
    }
}
