/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercico_Burbuja;

import java.util.Scanner;

/**
 *escribir un programa donde atraves de de un menu permita
 * 1) Registrar cedulas
 * 2) listarlas
 * 39 Ordenarlas por el metodo burbuja
 * @author 1059237155
 */
public class Operaciones {
    int cedulas[]= new int [4];
    Scanner in = new Scanner (System.in);
    
    void guardarCedulas(){
        System.out.println("REGISTRO DE CEDULAS");
        int cedIngresada;
        for (int i = 0; i < cedulas.length; i++) {
            System.out.println("Digite el numero de cedula " + (i+1));
            cedIngresada=in.nextInt();
            //guardar el arreglo
            cedulas[i]=cedIngresada;
        }
}
    void listarTodo(){ 
        System.out.println("CEDULA LISTADAS");
        for (int i = 0; i < cedulas.length; i++) {
            System.out.println(cedulas[i]+"-");
            
        }
}
    	void ordenarporBurbuja(int arreglo[]){
		int n=arreglo.length;
		//variable usada pa
		int aux=0;
		
		for (int i = 0; i < n-1; i++) {
			/*Este ciclo se encraga de llevar el mayor al final del arreglo
			 * Va desde 0 hasta se haya ido ornando el mayor
			 * */
			for (int j = 0; j < n-i-1; j++) {
				//en caso de que se cumpla la condicion se intercambia la posicion
				if(arreglo[j]>arreglo[j+1]){
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=aux;
				}
			}
			
		}
		
		//Listar el arreglo ordenado
		System.out.println("\n---Arreglo ordenado por metodo Burbuja----");
		for (int i : arreglo) {
			System.out.print(i+"-");
		}
		
	} //metodo para buscar
    void buscar(){
        System.out.println("Buscando...");
        System.out.print("Digite la cedula a buscar: ");
        int numBuscado=in.nextInt();
        
        //llamo al metodo del algortimo de busqueda binaria
        int datoRet=this.busquedaBinaria(numBuscado);
        
        if(datoRet== -1)
            System.out.println("Cedula no Encontrada!!");
        else
            System.out.println("Encontrada. Posicion="+datoRet);
    }
         //algortimo de busuqde binaria
    public int busquedaBinaria(int elementoBusqueda) {
        int inferior = 0; // extremo inferior del �rea de b�squeda
        int superior = cedulas.length - 1; // extremo superior del �rea de b�squeda
        int medio = (inferior + superior + 1) / 2; // elemento medio
        int ubicacion = -1; // devuelve el valor; -1 si no lo encontr�

        do {
            if (elementoBusqueda == cedulas[medio]) {
                ubicacion = medio; // la ubicaci�n es el elemento medio actual
            } // el elemento medio es demasiado alto
            else if (elementoBusqueda < cedulas[medio]) {
                superior = medio - 1; // elimina la mitad superior
            } else // el elemento medio es demasiado bajo
            {
                inferior = medio + 1; // elimina la mitad inferior
            }
            medio = (inferior + superior + 1) / 2; // recalcula el elemento medio
        } while ((inferior <= superior) && (ubicacion == -1));

        return ubicacion; // devuelve 
    }
      public void menu(){
       int opc = 0;
       
       do{
           System.out.println("""
                             \nMENU DE OPCIONES"
                        1) Registro cedulas
                        2) Mostrar cedulas
                        3) Ordenar por burbuja
                        4) Buscar cedula    
                        5) Salir""");
                                
           System.out.println("Digita una opcion");
           opc=in.nextInt();
           
           switch (opc){
               case 1:
                   this.guardarCedulas();
                   break;
               case 2:
                   this.listarTodo();
                   break;
               case 3:
                 this.ordenarporBurbuja(cedulas);
                   break;
               case 4:
                   this.ordenarporBurbuja(cedulas);
                   this.buscar();
                   break;
             
                   
           }}while(opc>0&&opc<5);
      }}