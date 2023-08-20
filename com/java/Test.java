package com.java;

import org.w3c.dom.NameList;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 11:09
 * @desciption:
 */
public class Test {
    private String name;
    private  int id;

    public Test() {
    }

    public Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Test{name = " + name + ", id = " + id + "}";
    }
}
