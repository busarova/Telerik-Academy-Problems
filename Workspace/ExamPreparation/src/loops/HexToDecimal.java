package loops;

import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hexNum = sc.nextLine();
		long decNum = 0;
		String hexDigits = "0123456789ABCDEF";
		
		for (int i = 0; i < hexNum.length(); i++) {
		
		int d = hexDigits.indexOf(hexNum.charAt(i));
        decNum = 16*decNum + d;
        
		}
		
		System.out.println(decNum);
	}

}
