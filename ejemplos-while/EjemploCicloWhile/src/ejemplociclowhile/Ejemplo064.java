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
public class Ejemplo064 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String pais;
        String capital;
        String reporte = "";
        int contador = 0;
        boolean ciclo = true;
        
        
        
        
        while(ciclo==true){
            System.out.println("ingrese un Pais");
            pais = entrada.nextLine();
            System.out.println("ingrese la Capital del Pais que ingreso");
            capital = entrada.nextLine();
            
            reporte = String.format("%s%s\t%s\n", reporte, pais,capital);
            contador = contador + 1;
                    
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                ciclo = false;
            }
        }
        
        reporte = String.format("%sTotal paises ingresados %d\n" ,reporte , contador);
        
        System.out.printf("%s\n",reporte);
        
    }
    
}

/*
Se repite un ciclo while mientras la variable bandera sea true
En cada vuelta pide un número al usuario que es -100 si quiere que el ciclo termine
Si el usuario ingresa -100, la bandera cambia a false y el ciclo se acaba
*/
