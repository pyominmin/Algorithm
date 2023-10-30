
import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		
		for(int i = A; i <= A; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i+" * "+ j + " = " + (i * j));
			}
			System.out.println("");
		}
	}
}
