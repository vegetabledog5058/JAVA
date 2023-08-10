package com.java.homework.day6.day7;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 19:03
 * @desciption: 多维数组
 */
public class poet_1 {
    public static void main(String[] args) {
        char[][]arr = {
                {'床','前','明','月','光'},
                {'疑','是','地','上','霜'},
                {'举','头','望','明','月'},
                {'低','头','思','故','乡'}
        };
        //p1(arr);
        p2(arr);
        //p3(arr);

    }

    public static void p3(char arr[][]){
        //输出词


    }
    public static void p2(char arr[][]){

        for (int i = 0; i < arr[i].length; i++) {
            for ( int j = arr.length-1; j >=0; j--) {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }


    }



    public static void p1(char arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
