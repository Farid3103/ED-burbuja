package burbuja;

public class Ordenamiento {
	
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
		
	}

}
