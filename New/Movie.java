package New;

public class Movie {
    String movieName;
    int runningTime;
    String filmDirector;
    Movie(String movieName,int runningTime,String filmDirector){
        this.movieName=movieName;
        this.runningTime=runningTime;
        this.filmDirector=filmDirector;
    }void setMovieName(String movieName){
        this.movieName=movieName;
    }String getMovieName(){
        return movieName;
    }void setRunningTime(int runningTime){
        this.runningTime=runningTime;
    }int getRunningTime(){
        return runningTime;
    }void setFilmDirector(String filmDirector){
        this.filmDirector=filmDirector;
    }String getFilmDirector(){
        return filmDirector;
    }public String toString(){
        return"your movie name-"+movieName+
                ", running time-"+runningTime+"min."+
                ", name of film director-"+filmDirector;
    }
}
