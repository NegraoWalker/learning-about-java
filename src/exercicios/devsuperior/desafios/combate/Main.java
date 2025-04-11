package exercicios.devsuperior.desafios.combate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int life, attack, armor, turns;

        System.out.println("=========================================================================");
        System.out.println("BEM VINDO AO JOGO!");
        System.out.println("=========================================================================");
        System.out.println("Informe os dados do primeiro campeão:");
        System.out.println("Nome:");
        name = scanner.nextLine();
        System.out.println("Vida inicial:");
        life = scanner.nextInt();
        System.out.println("Ataque:");
        attack = scanner.nextInt();
        System.out.println("Armadura:");
        armor = scanner.nextInt();

        Champion championA = new Champion(name, life, attack, armor);

        scanner.nextLine();
        System.out.println();

        System.out.println("Informe os dados do segundo campeão:");
        System.out.println("Nome:");
        name = scanner.nextLine();
        System.out.println("Vida inicial:");
        life = scanner.nextInt();
        System.out.println("Ataque:");
        attack = scanner.nextInt();
        System.out.println("Armadura:");
        armor = scanner.nextInt();

        Champion championB = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.println("Informe a quantidade de turnos que deseja executar:");
        turns = scanner.nextInt();

        for (int i = 1; i <= turns; i++) {
            championA.takeDamage(championB);
            championB.takeDamage(championA);
            System.out.println("Resultado do turno " + i + ":");
            System.out.println(championA.status());
            System.out.println(championB.status());
            if (championA.getLife() == 0 || championB.getLife() == 0) {
                break;
            }
        }
        System.out.println("FIM DO COMBATE!");
        scanner.close();
    }
}
