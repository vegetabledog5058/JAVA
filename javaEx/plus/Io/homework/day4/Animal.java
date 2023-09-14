package javaEx.plus.Io.homework.day4;

import java.io.InputStream;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 17:31
 * @desciption:
 */
public class Animal implements Serializable {
   @Serial
   private static final long serialVersionUID = 10L;
    private   String name;
    private  int id;
    private Animal animal;


    public Animal(String name, int id ) {
        this.name = name;
        this.id = id;
    }

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + id ;
    }
}
