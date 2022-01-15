package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(final String[] args) {

		final Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro valor: ");
		final double firstValue = isNumeric(scanner);

		System.out.println("Informe o segundo valor: ");
		final double secondValue = isNumeric(scanner);

		final double sum = firstValue + secondValue;
		final double multiplication = firstValue * secondValue;

		if (sum > multiplication) {
			System.out.println("A soma é maior que a múltiplicacao. valor: " + sum);
		} else if (sum < multiplication) {
			System.out.println("A múltiplicacao é maior que a soma. valor: " + multiplication);
		} else {
			System.out.println("A soma e a múltiplicação é igual a soma. valor: " + multiplication);
		}

	}

	private static double isNumeric(final Scanner scanner) {
		try {
			return scanner.nextDouble();
		} catch (final Exception e) {
			throw new RuntimeException("O valor é inválido");
		}
	}

}
