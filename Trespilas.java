/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trespilas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sale7
 */
public class Trespilas {
int pila[] = new int[100];
    int tope = 0;
    int pila1, pila2, pila3;
    
    
    public void Llenar(){
      Random numaleatorio = new Random();       //Ranom=numeros aleatorios que se generan y se encontraran en la pila
      pila1 = 1 + numaleatorio.nextInt(100);
      pila[tope]=pila1;
      pila1++;
      tope++;
      
      pila2 = 101 + numaleatorio.nextInt(200);
      pila[tope]=pila2;
      pila2++;
      tope++;
     }
   
    public void Mostrar() {
    for (int i = tope - 1; i >= 0; i--) {
    System.out.print("\nEl numero de la pila es:  " + pila[i]);
    }
    
    }
    
    public void Eliminar() {
    tope--;
    System.out.println("Se elimino el dato");
    }
    
    public void Sumar(){
    pila3= pila1 + pila2;
    System.out.println("Resultado de la pila es:"+pila3);
    }
    
    public static void main(String[] args) {
    Trespilas c = new Trespilas();
    Scanner sc = new Scanner(System.in);
    int opt = 0;
   
        do {
            System.out.println("\nSelecciona la opcion que deseas llenar\n"
                    + "1 Llenar\n"
                    + "2 Mostrar\n"
                    + "3 Eliminar\n"
                    + "4 Sumar\n"
                    + "5 Salir\n");
            
            switch (opt = sc.nextInt()) {
                case 1:
                    c.Llenar();
                    System.out.println("Las pilas estan correctamente llenas..");
                    break;
                case 2:
                    c.Mostrar();
                    break;
                case 3:
                    c.Eliminar();
                break;
                
                case 4:
                    c.Sumar();
                    break;
            }
        } while (opt != 5);
    }
}
        
    
    

