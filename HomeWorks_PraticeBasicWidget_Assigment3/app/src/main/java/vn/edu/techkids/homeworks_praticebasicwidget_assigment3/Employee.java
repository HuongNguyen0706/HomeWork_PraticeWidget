package vn.edu.techkids.homeworks_praticebasicwidget_assigment3;

import java.io.Serializable;

/**
 * Created by Admin on 4/6/2016.
 */
public class Employee implements Serializable {
    private String name;
    private int age;
    private String ngaySinh;
    public Employee(){

    }

    public Employee(String ngaySinh, int age, String name) {
        this.ngaySinh = ngaySinh;
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return name +"__"+ age +"__"+ ngaySinh;
    }
}
