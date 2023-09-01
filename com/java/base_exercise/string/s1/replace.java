package com.java.base_exercise.string.s1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/19 21:45
 * @desciption:
 */
public class replace {
    public static void main(String[] args) {
        String str = "你玩的真好,以后TMD,不用玩了tmd真的服了";
        // 定义敏感词库
        String []lab = {"sb","tmd","nmd"};
        //循环遍历数组每一个敏感词进行替换
        for (int i = 0; i < lab.length; i++) {
             str = str.replace(lab[i],"***");
        }
        System.out.println(str);
    }
}
