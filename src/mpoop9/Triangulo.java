/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *
 * @author A2
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gama;
    private float a,b,c;
    private float base,altura;

    /**
     *
     */
    public Triangulo() {
    }

    /**
     *
     * @param base
     * @param altura
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     * @return
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     *
     * @return
     */
    public int getBeta() {
        return beta;
    }

    /**
     *
     * @return
     */
    public int getGama() {
        return gama;
    }

    /**
     *
     * @return
     */
    public float getA() {
        return a;
    }

    /**
     *
     * @return
     */
    public float getB() {
        return b;
    }

    /**
     *
     * @return
     */
    public float getC() {
        return c;
    }

    /**
     *
     * @return
     */
    public float getBase() {
        return base;
    }

    /**
     *
     * @return
     */
    public float getAltura() {
        return altura;
    }

    /**
     *
     * @param base
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     *
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     *
     * @return
     */
    @Override
    public float area() {
        return base*altura/2;
    }

    /**
     *
     * @return
     */
    @Override
    public float perimetro() {
        return a+b+c;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + '}';
    }
}
