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
public class Ejemplo061 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        
        while(bandera==true){
            System.out.println("Estoy en el ciclo");
            
            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100");
            salir = entrada.nextInt();
            if(salir == -100){
                bandera = false;
            }
        }
        
    }
    
}

/*
Se repite un ciclo while mientras la variable bandera sea true
En cada vuelta pide un número al usuario que es -100 si quiere que el ciclo termine
Si el usuario ingresa -100, la bandera cambia a false y el ciclo se acaba
*/
