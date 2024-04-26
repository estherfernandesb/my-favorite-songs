package myfavoritessongs.principal.models;

public class Favorites {

    public void include(Audio audio){
        if(audio.getClassification() >= 5){
            System.out.println(audio.getTitle() + " this is one of my favorites!");
        }else{
            System.out.println(audio.getTitle() + " this isn't my favorite, but I like it!");
        }
    }
}
