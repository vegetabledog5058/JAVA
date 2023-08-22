package object.oriented.kfm.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 20:22
 * @desciption:
 */
public class Person {
    private String name;

    private Character gender;

    private Integer age;

    private Boolean marry;


    public Person() {
    }

    public Person(String name, Character gender, Integer age, Boolean marry) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.marry = marry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarry() {
        return marry;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person person) {
            if (person.getGender() != gender) {
                if (getMarry() == false && person.getMarry() == false) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return age +"岁的"+name;
    }
}
