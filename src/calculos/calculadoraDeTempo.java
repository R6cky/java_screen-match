package calculos;

import modelos.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
