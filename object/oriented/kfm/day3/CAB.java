package object.oriented.kfm.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 20:23
 * @desciption:
 */
public class CAB {
    public boolean canMarry(Person person1, Person person2) {
        if (person1.getGender() == '男') {
            if (person1.getAge() >= 22 && person2.getAge() >= 20) {
                if(person1.equals(person2)){
                    return true;
                }

            }
        } else {
            if (person2.getAge() >= 22 && person1.getAge() >= 20) {
                if(person1.equals(person2)){
                    return true;
                }
            }

        }
        return false;
    }
}




