package Exercico;

import java.util.Scanner;

public class Celular {
    // Definindo o enum ModeloCelular com alguns modelos e seus preços associados
    public enum ModeloCelular {
        IPHONE15(7999.00),
        GALAXYS22(4999.00),
        XIAOMIMI11(3999.00),
        MOTOROLAEDGE(3499.00),
        ASUSROGPHONE(5999.00);

        private final double preco;

        ModeloCelular(double preco) {
            this.preco = preco;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitando ao usuário para escolher um modelo de celular
        System.out.println("Escolha um modelo de celular:");
        System.out.println("IPHONE15, GALAXYS22, XIAOMIMI11, MOTOROLAEDGE, ASUSROGPHONE");

        String escolha = scanner.nextLine().toUpperCase();
        try {
            ModeloCelular modeloEscolhido = ModeloCelular.valueOf(escolha);
            System.out.println("Você escolheu: " + modeloEscolhido);
            System.out.println("Preço: R$ " + modeloEscolhido.getPreco());
        } catch (IllegalArgumentException e) {
            System.out.println("Modelo inválido. Por favor, escolha um modelo válido.");
        }
        scanner.close();
    }
}
