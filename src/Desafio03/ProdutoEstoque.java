package Desafio03;

import java.util.Scanner;

public class ProdutoEstoque {

     String nomeProduto;
     long codigoProduto;
     float quantidadeInicilaNoEstoque;


    public ProdutoEstoque(String nomeProduto, long codigoProduto, float quantidadeInicilaNoEstoque) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeInicilaNoEstoque = quantidadeInicilaNoEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getQuantidadeInicilaNoEstoque() {
        return quantidadeInicilaNoEstoque;
    }

    public void setQuantidadeInicilaNoEstoque(float quantidadeInicilaNoEstoque) {
        this.quantidadeInicilaNoEstoque = quantidadeInicilaNoEstoque;
    }

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("REGISTRO DE PRODUTO");
        System.out.println("Código do produto: ");
        codigoProduto = scanner.nextLong();
        System.out.println("Nome do produto: ");
        nomeProduto = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Quantidade inicial do produto no estoque: ");
        quantidadeInicilaNoEstoque = scanner.nextFloat();
        System.out.println("PRODUTO REGISTRADO");
    }


}

