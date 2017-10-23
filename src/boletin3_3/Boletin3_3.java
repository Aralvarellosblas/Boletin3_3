package boletin3_3;
/*
 * @author Arturo
 */
public class Boletin3_3 {

    public static void main(String[] args) {
        //Creamos un objeto constructor por defecto
        Circulo cir1=new Circulo();
        System.out.println("Radio = "+cir1.getRadio()); //Visualizamos
        //Cambiamos el valor del radio
        cir1.setRadio(15);
        System.out.println("Radio = "+cir1.getRadio()); //Visualizamos
        //Creamos uun segundo circulo
        Circulo cir2=new Circulo(50);
        System.out.println("Radio = "+cir2.getRadio()); //Visualizamos
        //Calculamos el area
        double area2= cir2.calculoArea();
        System.out.println("Area Circulo = "+area2); //Visualizamos
        //Calculamos la longitud
        double lonx2= cir2.calculoLonx();
        System.out.println("Loxitude Circulo = "+lonx2); //Visualizamos
    }
    
}
