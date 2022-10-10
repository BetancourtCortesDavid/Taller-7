import java.util.Scanner;


public class TSieteSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//definir e inicializar variables y arreglos
		double[]notas;
		notas = new double[5];
		
		double promedio=0;
		double total=0;
		
		//ciclo for para recorrer el arreglo
		for (int i=0; i<5; i++){
			//pedir valores para ir llenando el arreglo
			System.out.println("Ingrese la nota del "+(i+1)+"° examen: ");
			notas[i] = entrada.nextDouble();
			//un poco de "robustes" para el código, que solo acepte enteros positivos del 0 al 100
			while(notas[i]<0 || 100<notas[i]){
				System.out.println("¡Por favor ingrese una nota VALIDA! ");
				System.out.println("Ingrese la nota del "+(i+1)+"° examen: ");
				notas[i] = entrada.nextDouble();
			}
			//la variable total almacena la suma de todos los valores del arreglo
			total=total+notas[i];
		}
		//saco el promedio usando el total/la longitud del arreglo (notas)
		promedio=total/(notas.length);
		System.out.println("El promedio de las notas obtenidas es de: "+promedio);
	}

}



