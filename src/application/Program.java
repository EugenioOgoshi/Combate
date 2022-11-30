package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Champion C1,C2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome:");
		String name = sc.next();
		System.out.print("Vida inicial:");
		int life = sc.nextInt();
		System.out.print("Ataque:");
		int attack = sc.nextInt();
		System.out.print("Armadura:");
		int armor = sc.nextInt();
		System.out.println();
		
		C1 = new Champion(name,life,attack,armor);
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome:");
		String name2 = sc.next();
		System.out.print("Vida inicial:");
		int life2 = sc.nextInt();
		System.out.print("Ataque:");
		int attack2 = sc.nextInt();
		System.out.print("Armadura:");
		int armor2 = sc.nextInt();
		System.out.println();
		
		C2 = new Champion(name2,life2,attack2,armor2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar?");
		int turnos = sc.nextInt();
		for(int i = 1;i <= turnos;i++) {
			C1.takeDamage(C2);
			C2.takeDamage(C1);
			System.out.println();
			System.out.println("Resultado do turno "+ i +":");
			System.out.println(C1.status());
			System.out.println(C2.status());
			if(C1.getLife() == 0 || C2.getLife() == 0) {
				break;
			}
		}
		
		System.out.println();	
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
