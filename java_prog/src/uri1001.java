import java.util.Scanner;

public class uri1001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, X;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		X = a + b;

		System.out.println("X = " + X);
		
		sc.close();
	}
}