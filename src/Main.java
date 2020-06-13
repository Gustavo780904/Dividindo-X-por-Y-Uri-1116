import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = 0, Y = 0, N = 0;
		double divisao;
		
		N = sc.nextInt();
		
		
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			Y = sc.nextInt();
			if (Y != 0) {
				divisao = (double) X / Y;
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();

	}

}
