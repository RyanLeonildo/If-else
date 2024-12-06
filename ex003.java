import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A,B;
		
		System.out.println("DIGITE UM NUMERO:");
			A = sc.nextInt();
		System.out.println("DIGITE OUTRO NÚMERO");
			B = sc.nextInt();
			
		if(A%B == 0 || B%A == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao Sao Multiplos");
		}
			
		sc.close();
	}
			
}


