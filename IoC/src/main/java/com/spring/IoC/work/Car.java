package com.spring.IoC.work;

/**
 * Created by lenovo on 2019/3/4.
 */
public class Car {
    private String brand;
    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", parameer='" + parameer + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getParameer() {
        return parameer;
    }

    public void setParameer(String parameer) {
        this.parameer = parameer;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String parameer;
}
