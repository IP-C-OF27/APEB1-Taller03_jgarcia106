
public class Ejercicio06 {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        int numRaiz = 81;
        int variable2 = 9;
        double den1 = 3.0;
        int variable4 = 9;
        int variable5 = 10;
        int variable6 = 1;
        //RESOLUCION DEL PROBLEMA
        boolean resultado = ((Math.sqrt(numRaiz)+ variable2) / den1 == variable4) && (variable5 > variable6);
        //PRESENTACION DEL RESULTADO
        System.out.println("El resultado es: " + resultado);
                 
    }
}
