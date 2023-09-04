package javaEx.plus.collection.homework.day0904;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/4 19:23
 * @desciption: 创建一个List集合, 添加多个商品名称。实现根据输入查询某个商品是否存在,如果存在则输 出信息。
 */
public class Goods {
    private String name;
    private Integer No;

    public Goods() {
    }

    public Goods(String name, Integer No) {
        this.name = name;
        this.No = No;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return No
     */
    public Integer getNo() {
        return No;
    }

    /**
     * 设置
     *
     * @param No
     */
    public void setNo(Integer No) {
        this.No = No;
    }

    public String toString() {
        return "Goods{name = " + name + ", No = " + No + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Goods goods) return this.name.equals(goods.name) && this.No == goods.No;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + No;
        return result;
    }
}
