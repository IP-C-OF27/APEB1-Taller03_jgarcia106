
public class Ejercicio07 {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        int numRaiz1 = 81;
        int variable2 = 9;
        double den1 = 3.0;
        int variable4 = 9;
        int variable5 = 10;
        int variable6 = 1;
        double num1 = 100.0;
        int den2 = 25;
        int numRaiz2 = 100;
        //RESOLUCION DEL PROBLEMA
        boolean resultado = ((Math.sqrt(numRaiz1) + variable2) / den1 == variable4) || ((variable5 > variable6) && ((num1 / den2) >= Math.sqrt(numRaiz2)));
        //PRESENTACION DEL RESULTADO
        System.out.println("El resultado es: " + resultado);
        
        
     
    }
    
}
