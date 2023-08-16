package object.oriented.kfm.day2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 19:02
 * @desciption:
 */
public class GeometryCalculator {
   /* 几何图形计算器 设计一个几何图形计算器，可以计算圆的
    面积和矩形的面积。创建名为 GeometryCalculator 的
    类，
    包含以下实例方法：
    calculateCircleArea(double radius) ：计算并返回圆的面积
    calculateRectangleArea(double width, double height) ：计算并返回
            矩形的面积
    完成计算圆的面积以及计算矩形的面积等功能。*/

    private Double radius;
    private Double width;
    private Double height;

    public GeometryCalculator(Double radius, Double width, Double height) {
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public GeometryCalculator() {
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double calculateCircleArea(Double radius){
        return Math.PI * radius *radius;
    }
    public Double calculateRectangleArea(Double height,Double width){
        return height * width;
    }
}
