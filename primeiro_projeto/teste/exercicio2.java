package teste;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		double raio, raiz;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		raiz = (3.14159 * raio);
				
		System.out.println("A raiz quadrada do raio é?");
		System.out.println(raiz);
		
		
		sc.close();//oi
	}

}
