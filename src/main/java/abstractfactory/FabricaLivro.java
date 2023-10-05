package abstractfactory;

public class FabricaLivro implements FabricaAbstrata{
    @Override
    public Compra createCompra() {
        return new CompraLivro();
    }

    @Override
    public CarrinhoCompras createCarrinhoCompras() {
        return new CarrinhoComprasLivro();
    }
}
