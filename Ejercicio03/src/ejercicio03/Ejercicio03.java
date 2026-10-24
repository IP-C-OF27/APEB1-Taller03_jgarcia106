package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // Resolucion del problema
        int base = 10;
        int exponente = 2;
        int numRaiz = 6;
        double numerador = 20.0;
        int den1 = 1;
        int den2 = 11;
        //RESOLUCION DEL PROBLEMA UTILIZANDO VARIABLES
        double resultado = Math.pow(base, exponente) + Math.sqrt(numRaiz) + (numerador / (den1 + den2));
        //PRESENTACION DEL RESULTADO
        System.out.println("El resultado es: " + resultado);
        
      
    }
    
}
