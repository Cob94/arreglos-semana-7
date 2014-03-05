package areglos;
import java.util.Scanner;
public class arrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int arreglo []= new int [4];
		/*for (int i=0; i<10; i++){
	System.out.print("Ingrese numero "+i+": ");
	arreglo [i]= s.nextInt();
}*/
			
	
		
	for (int i=0; i<arreglo.length; i++ )
	{
		arreglo [i]= s.nextInt();
		if (arreglo[i]%2==0){
			
			System.out.println("Es par");
		}else {
			System.out.println("No es par");
		}
	}
		
		
	}

}
