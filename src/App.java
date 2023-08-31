import List.OperacoesBasicas.CarrinhoDeCompras;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("teste", 2, 4);

        System.out.println("deu tanto: " + c.calcValorTotal());
    }
}
