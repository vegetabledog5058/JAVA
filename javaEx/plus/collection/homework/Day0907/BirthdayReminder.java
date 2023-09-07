package javaEx.plus.collection.homework.Day0907;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 21:37
 * @desciption:编写一个生日提醒程序，使用Map来存储人名和对应的生日日期。够根据日期提醒用户哪些人今天过生日？ - 如何筛选显示出最近七天过生日的用户
 */
public class BirthdayReminder {
    static Map<String, LocalDate> map = new HashMap<>();

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2001, 4, 7);
        LocalDate localDate2 = LocalDate.of(1999, 5, 17);
        LocalDate localDate3 = LocalDate.of(2023, 9, 7);
        LocalDate localDate4 = LocalDate.of(2023, 9, 14);
        map.put("张三",localDate1);
        map.put("李四",localDate2);
        map.put("王五",localDate3);
        map.put("老六",localDate4);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate localDate = LocalDate.parse("2000-07-23",formatter);
        System.out.println("今天是他的生日");
        today();
        home();







    }

    public static void print(List resentweek){
        System.out.println(resentweek);
    }
    public static void home(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入1显示进7天过生日的人姓名");
        System.out.println("输入2新增生日信息");
        int choice = sc.nextInt();
        switch (choice){
            case 1 ->print(resentweek());
            case 2 ->legal();
            default -> home();
        }
    }
    public static void legal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年月日");
        LocalDate localDate = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        if(localDate==null)throw new DateTimeException("输入的日期格式非法");
        home();
    }

    public static void today() {
        Set<Map.Entry<String, LocalDate>> dates = map.entrySet();
        Iterator<Map.Entry<String, LocalDate>> iterator = dates.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> tem = iterator.next();
            if (tem.getValue().isEqual(LocalDate.now())) {
                System.out.println(tem.getKey());            }
        }

    }
    //最近七天过生日的用户
    public static List resentweek() {
        List list = new ArrayList<>();
        LocalDate afterWeek = LocalDate.now().plusDays(8);
        Set<Map.Entry<String, LocalDate>> dates = map.entrySet();
        Iterator<Map.Entry<String, LocalDate>> iterator = dates.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> tem = iterator.next();
            if (tem.getValue().isBefore(afterWeek) && tem.getValue().isAfter(LocalDate.now())) {
                list.add(tem.getKey());
            }
        }
        return list;
    }
}
