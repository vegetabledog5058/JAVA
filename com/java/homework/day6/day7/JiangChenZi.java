package com.java.homework.day6.day7;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 8:09
 * @desciption: 打印不规则二维数组
 */
public class JiangChenZi {
    public static void main(String[] args) {
        char[][] arr = {
                {'十', '年', '生', '死', '两', '茫', '茫', '\u002C', '不', '思', '量', '\u002C', '自', '难', '忘'},
                {'千', '里', '孤', '坟', '\u002C', '无', '处', '话', '凄', '凉', '\u3002'}, // 1 11
                {'纵', '使', '相', '逢', '应', '不', '识', '\u002C', '尘', '满', '面', '\u002C', '鬓', '如', '霜'},
                {'夜', '来', '幽', '梦', '忽', '还', '乡', '\u002C', '小', '轩', '窗', '\u002C', '正', '梳', '妆'},
                {'相', '顾', '无', '言', ',', '惟', '有', '泪', '千', '行', '\u3002'},
                {'料', '得', '年', '年', '肠', '断', '处', '\u002C', '明', '月', '夜', '\u002C', '短', '松', '冈'}
        };


        // M1(arr);
        // M2(arr);

    }

    public static void M1(char arr[][]) {
        int max = arr[0].length;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i].length);
//             max = arr[i].length;
//            if (arr[i].length>max){
//                max = arr[i].length;
//            }
        }


        for (int i = 0; i < max; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (i >= arr[j].length) {
                    System.out.print(" " + "\t");
                } else {
                    System.out.print(arr[j][i] + "\t");
                }
            }
            System.out.println();
        }

    }



}

