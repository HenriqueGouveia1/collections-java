package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros(List<Integer> listaNumeros) {
        this.listaNumeros = new ArrayList<>();
    }

    public void addNumero(int num) {
        listaNumeros.add(num);
    }

    public int calcSoma() {
        int soma = 0;
        for (Integer numero : listaNumeros) {
            soma += numero;

        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int Maior = 0;
        if (!this.listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                if (numero >= Maior) {
                    Maior = numero;
                }
            }
        }
        return Maior;

    }

     public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if (!this.listaNumeros.isEmpty()) {
            for (Integer numero : listaNumeros) {
                if (numero <= menor) {
                    menor = numero;
                }
            }
        }
        return menor;

    }

    public void exibeNumeros(){
       if (!listaNumeros.isEmpty()) {
         System.out.println("Lista de números: ");
        System.out.println(this.listaNumeros);
       }
       else{
        System.out.println("vazio");
       }
    }
}
