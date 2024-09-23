package burbuja;

public class PruebaBurbuja {

	public static void main(String[] args) {
		Ordenamiento ord=new Ordenamiento();
		int arr[]={12,1,0,9,3};
		
		System.out.println("---Arreglo desordenado----");
		//Listando el arreglo desordenado
		for (int i : arr) {
			System.out.print(i+"-");
		}
		ord.ordenarporBurbuja(arr);

	}

}
