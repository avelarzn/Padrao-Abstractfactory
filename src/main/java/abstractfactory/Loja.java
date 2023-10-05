package abstractfactory;

public class Loja {
    private Compra compra;
    private CarrinhoCompras carrinhoCompras;

    public Loja (FabricaAbstrata fabrica) {
        this.compra = fabrica.createCompra();
        this.carrinhoCompras = fabrica.createCarrinhoCompras();
    }

    public String realizarCompra() {
        return this.compra.emitir();
    }

    public String adicionarCarrinho() {
        return this.carrinhoCompras.emitir();
    }
}
