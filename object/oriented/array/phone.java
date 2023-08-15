package object.oriented.array;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 22:58
 * @desciption: 第三个对象数组练习
 */
public class phone {
    private String brand;
    private int price;
    private String color;

    public phone(){

    }
    public phone (String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
