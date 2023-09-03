package object.oriented.kfm;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 19:21
 * @desciption: equals重写
 */
public class Override_equals {
    private String name;
    private int age;

    public Override_equals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Override_equals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        // if(obj.getClass() == this.getClass()){}
        if (obj instanceof Override_equals over) {
            if (over.name.equals(this.name)) {
                if (over.age == this.age) {
                    return true;
                }
            }
        }

        return false;

    }

    public int hashCode() {
        int result = 1;
        result = result * 31 + name.hashCode();
        result = result * 31 + age;
        return result;
    }

}
