/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author Arturo
 */
public class EjemplosConsola {
    
    //declaro un array de ints de instancia
    int[] listaNumeros	= {200, 87, 27, 2, 5, 99};
    
    
    /* 
    El método maximos va a calcular el maximo y el segundo maximo 
    de una lista de numeros
    */
    private int[] maximos (int[] lista){
        //Declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int [] listaMaximos = {lista[0], lista[0]};
        for (int i=0; i<lista.length; i++){
            if (lista[i] >= listaMaximos[0]){
                //si llega aquí, es que el numero que estoy
                //comparando es mayor o igual que el que tengo primero en la
                //lista de maximos  
                if(i!=0){
                     listaMaximos[1] = listaMaximos[0]; //desplazo a la derecha que habia como máximo
                }
                listaMaximos[0] = lista[i]; //pongo en l primera posición al nuevo máximo
            } 
            else if (lista[i] >= listaMaximos[1]){ //compruebo si el número que estoy leyendo es mayor que el SEGUNDO de la lista de máximos
                
                listaMaximos[1] = lista[i]; //pongo en l SEGUNDA posición al nuevo máximo
            }
        }
        
        return listaMaximos;
    }
    
    
    
    public static void main(String[] args) {
       EjemplosConsola ejercicios = new EjemplosConsola();
       System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros))); 
    }
    
}
