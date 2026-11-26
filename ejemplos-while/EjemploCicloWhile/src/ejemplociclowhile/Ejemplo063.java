/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Ejemplo063 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String pais;
        String capital;
        String reporte = "";
        boolean ciclo = true;
        
        
        
        
        while(ciclo==true){
            System.out.println("ingrese un Pais");
            pais = entrada.nextLine();
            System.out.println("ingrese la Capital del Pais que ingreso");
            capital = entrada.nextLine();
            
            reporte = String.format("%s%s\t%s\n", reporte, pais,capital);
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                ciclo = false;
            }
        }
        
        System.out.printf("%s\n",reporte);
        
    }
    
}

/*
Se repite un ciclo while mientras la variable bandera sea true
En cada vuelta pide un número al usuario que es -100 si quiere que el ciclo termine
Si el usuario ingresa -100, la bandera cambia a false y el ciclo se acaba
*/
