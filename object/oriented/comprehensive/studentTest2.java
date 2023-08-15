package object.oriented.comprehensive;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 7:51
 * @desciption: 测试类
 */
public class studentTest2 {
    public static void main(String[] args) {
        Student arr[] = new Student[3];
        Student s1 = new Student(1, "张三", 20);
        Student s2 = new Student(2, "李四", 26);
        Student s3 = new Student(3, "王五", 24);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //要求5.查询id为2的学生,如果存在将年龄+1
        int index = findIndex(arr,2);
        if(index !=-1){
        Student s = arr[index];
        s.setAge(s.getAge()+1);
        printArr(arr);
        }else {
            System.out.println("不存在的ID");
        }
    }
    //查询索引
    public static int findIndex(Student []arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            //非空判断
            if (s != null) {
                if(id == s.getId()){
                    return i;
                }
            }

        }return -1;
    }
    public static void printArr(Student[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (arr[i] != null) {
                System.out.println(s.getId() + "," + s.getName() + "," + s.getAge());
            }
        }

    }
}
