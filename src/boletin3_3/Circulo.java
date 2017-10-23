package boletin3_3;
/*
 * @author Arturo
 */
public class Circulo {
    private double radio;
    final double PI = 3.14;
    
    public Circulo(){
        radio=0;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double calculoArea(){
        double area= PI* Math.pow(radio, 2);
        return area;
    }
    public double calculoLonx(){
        double lonx= 2*PI*radio;
        return lonx;
    }
}
