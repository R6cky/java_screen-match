package principal;

import modelos.Filme;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var listaComVar = new ArrayList<Filme>();

        Filme movie1 = new Filme("Blade o caçador de vampiros", 1999);
        movie1.setDiretor("Warner Bros");
        movie1.setDuracaoEmMinutos(120);
        movie1.setIncluidoNoPlano(true);
        movie1.avalia(10);


        Filme movie2 = new Filme("matrix", 2003);
        movie2.setDiretor("Marvel");
        movie2.setDuracaoEmMinutos(70);
        movie2.setIncluidoNoPlano(true);
        movie2.avalia(10);

        Filme movie3 = new Filme("Eu sou a lenda", 2022);
        movie3.setAnoDeLancamento(2022);
        movie3.setDuracaoEmMinutos(80);
        movie3.setIncluidoNoPlano(true);
        movie3.avalia(7);

        listaComVar.add(movie1);
        listaComVar.add(movie2);
        listaComVar.add(movie3);



        System.out.println("tamanho da lista: " + listaComVar.size());
        System.out.println("Nome do primeiro filme da lista: " + listaComVar.get(0).getNome());
        System.out.println("Imprimindo toda a lista: " + listaComVar);
        System.out.println("toString do filme; " + listaComVar.get(0).toString() );








    }
}