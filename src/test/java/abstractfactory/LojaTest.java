package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {
    @Test
    void deveEmitirLivroCarrinhoCompras() {
        FabricaAbstrata fabrica = new FabricaLivro();
        Loja loja = new Loja(fabrica);
        assertEquals("Livro no carrinho de compras", loja.adicionarCarrinho());
    }

    @Test
    void deveEmitirCelularCarrinhoCompras() {
        FabricaAbstrata fabrica = new FabricaCelular();
        Loja loja = new Loja(fabrica);
        assertEquals("Celular no carrinho de compras", loja.adicionarCarrinho());
    }

    @Test
    void deveEmitirCompraLivro() {
        FabricaAbstrata fabrica = new FabricaLivro();
        Loja loja = new Loja(fabrica);
        assertEquals("Livro comprado", loja.realizarCompra());
    }

    @Test
    void deveEmitirCompraCelular() {
        FabricaAbstrata fabrica = new FabricaCelular();
        Loja loja= new Loja(fabrica);
        assertEquals("Celular comprado", loja.realizarCompra());
    }
}