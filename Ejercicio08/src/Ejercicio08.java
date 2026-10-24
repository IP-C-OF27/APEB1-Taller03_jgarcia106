
public class Ejercicio08 {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        double num1 = 500.0;
        int den1 = 2;
        int base = 3;
        int exponente = 2;
        int var4 = 200;
        int var5 = 50;
        int var6 = 50;
        int var7 = 50;
        int var8 = 51;
        //RESOLUCION DEL PROBLEMA
        boolean resultado = (((var1 * var2) + var3 - (num1 / den1) + Math.pow(base, exponente)) >= var4) || (var5 >= var6 - var7 + var8);
        //PRESENTACION DEL RESULTADO
        System.out.println("El resultado es: " + resultado);
                
    }
    
}
