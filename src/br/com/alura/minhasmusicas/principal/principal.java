package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        MinhasPreferidas preferidas = new MinhasPreferidas();



        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcos Mendes");

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 600; i++) {
            meuPodcast.curte();
        }



        System.out.println("Curtidas musica: " + minhaMusica.getTotalCurtidas());
        System.out.println("Reproduções musica: " + minhaMusica.getTotalReproducoes());

        System.out.println("Curtidas podcast: " + meuPodcast.getTotalCurtidas());
        System.out.println("Reproduções podcast: " + meuPodcast.getTotalReproducoes());
    }

}
