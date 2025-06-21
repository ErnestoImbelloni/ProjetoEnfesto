package view;

import model.Molde;
import java.util.Scanner;

public class Enfesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Molde ===");
        System.out.print("Digite o nome do molde: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a largura do molde (em cm): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do molde (em cm): ");
        double altura = scanner.nextDouble();

        Molde molde = new Molde(nome, largura, altura);

        System.out.println("\nMolde cadastrado com sucesso:");
        System.out.println(molde);

        scanner.close();
    }
}
