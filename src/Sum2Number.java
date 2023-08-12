import java.util.*;

class Sum2Number {

	public static Scanner Scanner = new Scanner(System.in);
	
	
	public static void main (String args[]){
		int num1, num2, soma;
		System.out.println("Digite um número");
		num1 = Scanner.nextInt();
		System.out.println("Digite outro número");
		num2 = Scanner.nextInt();
		soma = num1 + num2;
		System.out.println("Soma:" + soma);
	}
}
