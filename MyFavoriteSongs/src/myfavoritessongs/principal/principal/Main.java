package myfavoritessongs.principal.principal;
import myfavoritessongs.principal.models.Favorites;
import myfavoritessongs.principal.models.Music;
import myfavoritessongs.principal.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Gold Lion");
        myMusic.setBand("Yeah Yeah Yeahs");
        myMusic.setAlbum("Show Your Bones");
        myMusic.setGenre("Alternative Rock");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }
        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("França e o Labirinto");
        myPodcast.setHost("Selton Mello");
        myPodcast.setSynopsis("França e o Labirinto é uma produção de áudio que gira em torno de Nelson França, um detetive que, em seu passado, contribuiu para a captura de um notório serial killer.");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        Favorites myFavorites = new Favorites();
        myFavorites.include(myPodcast);
        myFavorites.include(myMusic);
    }
}