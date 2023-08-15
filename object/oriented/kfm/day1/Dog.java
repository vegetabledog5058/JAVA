package object.oriented.kfm.day1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 19:18
 * @desciption:
 */
public class Dog {
//    定义狗类Dog。
//    属性:毛的颜色color，品种breed。行为:吃饭()，看家()

  private String color;
  private String breed;

  public Dog() {
  }

  public Dog(String color, String breed) {
    this.color = color;
    this.breed = breed;
  }

  public void eating(){

    System.out.println(color+breed+"正在啃骨头...");
    }
    public void watching(){

      System.out.println(color+breed+"正在看家...");
    }

}
