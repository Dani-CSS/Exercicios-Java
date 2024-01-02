package exer1;

import java.util.Scanner; 

public class Brinde {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = scan.nextInt();
		
		if(idade > 0 && idade < 18) {
			System.out.println("Vai ganhar o valor em dinheiro");
		} else if (idade > 0 && idade >= 18){
			System.out.println("Vai ganhar o Whisky");
		} else {
			System.out.println("Idade informada inválida!");
		}

	}

}