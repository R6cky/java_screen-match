package principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.*;

public class PrincipalComlistas {
    public static void main(String[] args) {
        Filme movie1 = new Filme("Blade o caçador de vampiros", 1999);
        Filme movie2 = new Filme("matrix", 2003);
        Filme movie3 = new Filme("Eu sou a lenda", 2022);
        Serie serie = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();

        lista.add(movie1);
        lista.add(movie2);
        lista.add(movie3);
        lista.add(serie);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println(filme.getClassificacao());
            };
            }


        //var listString = new ArrayList<>();
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Paulo");
        listaString.add("Rodrigo");
        listaString.add("Edcarlos");
        listaString.add("Antonio");

        Collections.sort(listaString);
        System.out.println(listaString);
        Collections.sort(lista);

        System.out.println("Ordenando por nome");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nComparando por ano de lançamento");
        System.out.println(lista);

    }


}
