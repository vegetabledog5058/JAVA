package object.oriented.kfm.Filmv2_0;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/21 21:00
 * @desciption:
 */
public class Movie {
    private String name;
    private Double price;
    private String director;
    private Integer date;
    private Integer ticketCount;

    public Movie() {
    }


    public Movie(String name, Double price, String director, Integer date, Integer ticketCount) {
        this.name = name;
        this.price = price;
        this.director = director;
        this.date = date;
        this.ticketCount = ticketCount;

    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getPrice() + "\t" + getDirector() + "\t" + getDate() + "\t"+getTicketCount() + "\t";
    }
}
