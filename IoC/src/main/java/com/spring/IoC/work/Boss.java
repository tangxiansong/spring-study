package com.spring.IoC.work;

        import java.util.List;

/**
 * Created by lenovo on 2019/3/4.
 */
public class Boss {
    private String name;
    private String company;

    public Car getCar() {
        return car;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", hobby=" + hobby +
                '}';
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public void setCar(Car car) {
        this.car = car;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Car car;
    private List<String> hobby;

}
