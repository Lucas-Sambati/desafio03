package Desafio03;

import java.util.Scanner;

public class executoraDesafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numProdutosCadastrados;
        int numInformacoesDoProduto; //código, nome e quantidadeInicial

        String nomeProduto;
        long codigoProduto;
        float quantidadeInicilaNoEstoque;


        System.out.println("Quantos produtos serão cadastradsos: ");
        numProdutosCadastrados = scanner.nextInt();
        System.out.println("Quantos campos para preenchimento de informação esses produtos terão: ");
        numInformacoesDoProduto = scanner.nextInt();

        ProdutoEstoque[][] matrizProdutos = new ProdutoEstoque[numProdutosCadastrados][numInformacoesDoProduto];

        for (int i = 0; i < numProdutosCadastrados; i++) {
            System.out.println("Produto: " + (i + 1) + ": ");
            System.out.println("Nome: ");
            nomeProduto = scanner.nextLine();
            scanner.nextLine();

            System.out.println("codigo: ");
            codigoProduto = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Quantidade inicial no estoque: ");
            quantidadeInicilaNoEstoque = scanner.nextInt();
            scanner.nextLine();

            matrizProdutos[i][0] = new ProdutoEstoque(nomeProduto, codigoProduto, quantidadeInicilaNoEstoque);


        }
    }
}
