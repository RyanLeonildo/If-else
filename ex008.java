import java.util.Scanner;


public class ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sal, imp;
		
		System.out.println("DIGITE O SEU SALÁRIO");
			sal = sc.nextDouble();
			
		if (sal <= 2000.00) {
			imp = 0.0;
			
		}else if(sal <=3000.00) {
			imp = (sal - 2000.0)* 0.08;
			
		}else if(sal <= 4500.00) {
			imp = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
			
		} else {
			imp = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;	
		}

		if (imp == 0.0) {
			System.out.println("Isento");
				
		}else {
			System.out.printf("R$ %.2f%n", imp);
			
		}
		
		sc.close();	
	}

}
