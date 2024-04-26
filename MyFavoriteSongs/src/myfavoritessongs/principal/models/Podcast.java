package myfavoritessongs.principal.models;

public class Podcast extends Audio{
    private String host;
    private String synopsis;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public int getClassification() {
        if(this.getTotalLikes() > 5000){
            return 5;
        } else{
            return 3;
        }
    }
}
