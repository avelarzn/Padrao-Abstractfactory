package abstractfactory;

public class FabricaCelular implements FabricaAbstrata{
    @Override
    public Compra createCompra() {
        return new CompraCelular();
    }

    @Override
    public CarrinhoCompras createCarrinhoCompras() {
        return new CarrinhoComprasCelular();
    }
}
