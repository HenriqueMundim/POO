package br.com.exe03;

public class Venda {
    private Comprador c;
    private Vendedor v;
    private Produto p;

    public void concretizarVenda() {
        System.out.println("Venda confirmada");
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");
    }
}
