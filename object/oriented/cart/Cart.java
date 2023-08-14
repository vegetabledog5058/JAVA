package object.oriented.cart;

import com.sun.source.tree.IfTree;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/13 17:53
 * @desciption: 购物车
 */
public class Cart {
    private int id;
    private String name;
    private double price;
    private int storage;

    public Cart(){

    }
    public Cart(int id,String name,double price,int storage){
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }


    public int getId() {
        return id;
    }
    public void setid(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage = storage;
    }



}
