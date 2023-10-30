
import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] num1 = new int[num];
		int[] num2 = new int[num];
		 for (int i = 0; i < num; i++) {  // 반복 범위를 num으로 수정합니다.
	            num1[i] = in.nextInt();
	            num2[i] = in.nextInt();
	        }

	        // 배열 요소를 출력
	        for (int i = 0; i < num; i++) {
	            System.out.println(num1[i] + num2[i]);  // 개행 문자를 포함하여 결과를 출력합니다.
	        }
	    }
	}
