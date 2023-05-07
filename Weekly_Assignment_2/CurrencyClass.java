package Weekly_Assignment_2;

import java.util.*;
public class CurrencyClass {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("R Ruppe");
			System.out.println("D Dollar");
			System.out.println("E Euro");
			System.out.println("Y Yen");
			System.out.println("P Peso");
			
			System.out.println("Choose the currency");
			char a = sc.next().charAt(0);
			System.out.println("Enter the amount");
			double amount = sc.nextDouble();
			
			// convert the amount
			switch (a) {
			case 'R':
				Ruppe_to_other(amount);
				break;
			case 'D':
				Dollar_to_other(amount);
				break;
			case 'E':
				Euro_to_other(amount);
				break;
			case 'Y':
				Yen_to_other(amount);
				break;
			case 'P':
				Peso_to_other(amount);
				break;
			default:
				System.out.println("Choice does not exsit.");
			}

		}

		public static void Ruppe_to_other(double amt) {
			System.out.println("1 Ruppe = " + 0.013 + " Dollar");
			System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
			System.out.println("1 Ruppe = " + 0.012 + " Euro");
			System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
			System.out.println("1 Ruppe = " + 1.64 + " Yen");
			System.out.println(amt + " Ruppe = " + (amt * 1.64) + " Yen");
			System.out.println("1 Ruppe = " + 2.72 + " Peso");
			System.out.println(amt + " Ruppe = " + (amt * 2.72) + " Peso");
		}
		public static void Dollar_to_other(double amt) {
			System.out.println("1 Dollar = " + 79.37 + " Ruppe");
			System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
			System.out.println("1 Dollar= " + 0.98 + " Euro");
			System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
			System.out.println("1 Dollar = " + 134.83 + " Yen");
			System.out.println(amt + " Dollar = " + (amt * 134.83) + " Yen");
			System.out.println("1 Dollar = " + 222.34 + " Peso");
			System.out.println(amt + " Dollar = " + (amt * 222.34) + " Peso");
		}

		public static void Euro_to_other(double amt) {
			System.out.println("1 Euro = " + 90.85 + " Ruppe");
			System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
			System.out.println("1 Euro = " + 1.12 + " Dollar");
			System.out.println(amt + " Euro = " + (amt * 1.12) + " Dollar");
			System.out.println("1 Euro = " + 151.15 + " Yen");
			System.out.println(amt + " Euro = " + (amt * 151.15) + " Yen");
			System.out.println("1 Euro = " + 249.25+ " Peso");
			System.out.println(amt + " Euro = " + (amt * 249.25) + " Peso");
		
		}
		public static void Yen_to_other(double amt) {
			System.out.println("1 Yen = " + 0.606 + " Ruppe");
			System.out.println(amt + " Yen = " + (amt * 0.606) + " Ruppe");
			System.out.println("1 Yen = " + 0.010 + " Dollar");
			System.out.println(amt + " Yen = " + (amt * 0.010) + " Dollar");
			System.out.println("1 Yen = " + 0.0066 + " Euro");
			System.out.println(amt + " Yen = " + (amt * 0.0066) + " Euro");
			System.out.println("1 Yen = " + 1.64 + " Peso");
			System.out.println(amt + " Yen = " + (amt * 1.64) + " Peso");
		
		}
		public static void Peso_to_other(double amt) {
			System.out.println("1 Peso = " + 0.367 + " Ruppe");
			System.out.println(amt + " Peso = " + (amt * 0.367) + " Ruppe");
			System.out.println("1 Peso = " + 0.0045 + " Dollar");
			System.out.println(amt + " Peso = " + (amt * 0.0045) + " Dollar");
			System.out.println("1 Peso = " + 0.606+ " Yen");
			System.out.println(amt + " Peso = " + (amt * 0.606) + " Yen");
			System.out.println("1 Peso = " + 0.004 + " Euro");
			System.out.println(amt + " Peso = " + (amt * 0.004) + " Euro");
		
		}
	
}