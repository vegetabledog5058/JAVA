package object.oriented.kfm.Filmv2_0;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/21 23:44
 * @desciption:
 */
public class Tickets {
    private Movie movie;

    private int count;



    public Tickets() {
    }
    public Tickets(Movie movie, int count) {
        this.movie = movie;
        this.count = count;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String info() {
        return this.movie.getName() + "\t" + this.movie.getDate() + " \t " + this.count;
    }
}
