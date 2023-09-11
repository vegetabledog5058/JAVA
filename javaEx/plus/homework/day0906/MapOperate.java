package javaEx.plus.homework.day0906;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/6 20:42
 * @desciption: 创建一个Map，完成以下操作：
 * - 将我国省份和其简称存到 Map 集合中
 * - 将省份名称中包含"江"的省份从集合中删除
 * - 遍历输出集合元素
 */
public class MapOperate {
    public static void main(String[] args) {

        // 创建一个Map集合来存储中国省份和其简称
        Map<String, String> provinces = new HashMap<>();

// 将我国省份和其简称存到 Map 集合中
        provinces.put("北京", "京");
        provinces.put("天津", "津");
        provinces.put("上海", "沪");
        provinces.put("重庆", "渝");
        provinces.put("河北", "冀");
        provinces.put("山西", "晋");
        provinces.put("辽宁", "辽");
        provinces.put("吉林", "吉");
        provinces.put("黑龙江", "黑");
        provinces.put("江苏", "苏");
        provinces.put("浙江", "浙");
        provinces.put("安徽", "皖");
        provinces.put("福建", "闽");
        provinces.put("江西", "赣");
        provinces.put("山东", "鲁");
        provinces.put("河南", "豫");
        provinces.put("湖北", "鄂");
        provinces.put("湖南", "湘");
        provinces.put("广东", "粤");
        provinces.put("海南", "琼");
        provinces.put("四川", "川");
        provinces.put("贵州", "黔");
        provinces.put("云南", "滇");
        provinces.put("陕西", "陕");
        provinces.put("甘肃", "甘");
        provinces.put("青海", "青");
        provinces.put("台湾", "台");
        provinces.put("内蒙古", "蒙");
        provinces.put("广西", "桂");
        provinces.put("西藏", "藏");
        provinces.put("宁夏", "宁");
        provinces.put("新疆", "新");
        provinces.put("香港", "港");
        provinces.put("澳门", "澳");
        System.out.println(provinces.size());

        Set<String> name = provinces.keySet();

        Set<String>tem = new HashSet<>();
        //创建匹配器
        String regex = ".*江.*";
        Pattern pattern = Pattern.compile(regex);

       name.removeIf((e)->e.contains("江"));
        System.out.println(provinces);
        System.out.println(provinces.size());
        Iterator<String> iterator = name.iterator();
        //while (iterator.hasNext()) {
            String provinceName = iterator.next();
//            if (provinceName.indexOf("江") >= 0) {
////                tem.add(provinceName);
//                iterator.remove();
//            }
            //正则
//            Matcher matcher =  pattern.matcher(provinceName);
//            if(matcher.matches()){
//                iterator.remove();
//            }
     //   }
        //匹配集合删除
//        System.out.println(tem);
//        for (String pname:tem
//             ) {
//            provinces.remove(pname);
//        }
        System.out.println(provinces.size());
        System.out.println(provinces);
    }
}
