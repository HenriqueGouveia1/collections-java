package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
   private List<Item> ListaDeItem;

public CarrinhoDeCompras() {
    ListaDeItem = new ArrayList<>();
}

public void adicionarItem(String nome, double preco, int quantidade){
    Item item = new Item(nome, preco, quantidade);
    ListaDeItem.add(item);
}

public void removerItem(String nome){
    List itensParaRemover = new ArrayList<>();
    if (!ListaDeItem.isEmpty()) {
        for (Item item : ListaDeItem) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        ListaDeItem.removeAll(itensParaRemover);
    }
    else{
        System.out.println("Lista vazia");
    }
}

public double calcValorTotal(){
    double valorTotal = 0d;
    if (!ListaDeItem.isEmpty()) {   
        for (Item item : ListaDeItem) {
        
        double valorItens = item.getPreco() * item.getQuantidade();
        valorTotal += valorItens;
        }
        return valorTotal;
    }
    else{
        throw new RuntimeException("lista vazia");
    }
    
}

public void exibeItem(){
    if(!ListaDeItem.isEmpty()){
        System.out.println(this.ListaDeItem);
    }else{
        System.out.println("Vazia");
    }
}
}
