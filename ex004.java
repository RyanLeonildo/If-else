import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempIni, tempFin, duracao;
		
		
		System.out.println("DIGITE A HORA INICIAL");
			tempIni = sc.nextInt();
		System.out.println("DIGITE A HORA INICIAL");
			tempFin = sc.nextInt();
			
		if (tempIni < tempFin) {
				duracao = tempFin - tempIni;
			
		}else {
				duracao = 24 - tempIni + tempFin;
			
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		sc.close();
	}

}
