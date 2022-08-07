package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double peso =0;
		double altura =0;
		double imc;
		System.out.println("--CALCULADORA IMC--");

		boolean pesoValido = false;
		boolean alturaValida = false;

		while (!pesoValido) {

			System.out.println("Entre com o peso");

			try {
				peso = sc.nextDouble();
				pesoValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Valor inválido.. digite novamente.");
				sc.nextLine();
				pesoValido = false;
				System.out.println();
			}
		}
		 while(!alturaValida) {
			 System.out.println("Entre com a altura: ");
			 
			 try {
				 altura = sc.nextDouble();
				 alturaValida = true;
			 }catch (InputMismatchException e) {
				 System.out.println("Insira a sua altura com vírgula");
				 sc.nextLine();
				 alturaValida = false;
				 System.out.println();
			 }
		 }
		 
		 imc = peso / (altura * altura);
		 
		 if(imc < 18.5) {
			 System.out.println("Vocês está abaixo do peso normal");
		 }
		 else if(imc <= 24.9) {
			 System.out.println("Peso normal");
		 }
		 else if(imc <=29.9) {
			 System.out.println("Você está com excesso de peso.");
		 }
		 else if(imc <= 34.9) {
			 System.out.println("Obesidade classe I");
		 }
		 else if (imc <=39.9) {
			 System.out.println("Obesidade Classe II");
		 }
		 else if (imc >= 40.0) {
			 System.out.println("Obesidade mórbida");
		 }
		 
		 System.out.printf("Seu IMC é de: %.2f", imc);
	
	}

}
