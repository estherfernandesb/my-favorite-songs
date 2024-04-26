package myfavoritessongs.principal.models;

public class Music extends Audio{
    private String album;
    private String band;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification() {
        if(this.getTotalPlayback() > 2000){
            return 5;
        }else{
            return 3;
        }
    }
}
