package application;

import java.util.Scanner;

import util.Calc;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();

		System.out.println("Digite uma expressão matemática: ");
		String expressao = sc.nextLine();

		if (calc.verificarExpressao(expressao)) {
			System.out.println("Correta!");
		} else {
			System.out.println("Incorreta!");
		}

		sc.close();
	}

}
