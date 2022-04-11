import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class practicaUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 1;
		int max = 10;
		int numeroElegido = 0;
		int n = 0;
		try {
			
			System.out.println("Se van a generar de manera aleatoria 10 números del 1 al 10");
			do {
				System.out.println("Elige un numero entre el 1 al 10 para ver si aciertas, presiona 0 para salir ");

				Scanner sc = new Scanner(System.in);

				numeroElegido = sc.nextInt();
				
				if ((numeroElegido < 0) || numeroElegido > 10) {
					System.out.println(" Hemos dicho del uno al 10, empieza de nuevo");
					break;
				}

				for (int i=0; i<10; i++) {
					int numeroRandom = ThreadLocalRandom.current().nextInt(min, max );
					System.out.println(numeroRandom);
					if(numeroElegido == numeroRandom) {
						n++;
					}
					
				}
				System.out.println("Has acertado " + n + " veces");

			}while(numeroElegido != 0);
		}catch(InputMismatchException e) {
			System.out.println("Números del 1 al 10 por favor ");
		}

	}
}
