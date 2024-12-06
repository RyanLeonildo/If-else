import java.util.Locale;
import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double X, Y;
		
		System.out.println("DIGITE O EIXO X");
			X = sc.nextDouble();
			
		System.out.println("DIGITE O EIXO Y");
			Y = sc.nextDouble();
			
		if(X > 0 && Y > 0) {
			System.out.println("Q1");
			
		}else if (X < 0 && Y > 0) {
			System.out.println("Q2");
			
		}else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		}else if (X > 0 && Y <0){
			System.out.println("Q4");
			
		}else {
			System.out.println("Origem.");
			
		}
		
		sc.close();
	}

}
