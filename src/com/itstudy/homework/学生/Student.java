package com.itstudy.homework.学生;

import java.util.Objects;

public class Student {
    private int number;
    private String name;
    private String xingzuo;
    private Long tel;
    private String add;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number && Objects.equals(name, student.name)  && Objects.equals(tel, student.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, xingzuo, tel, add);
    }

    public Student() {
    }

    public Student(int number, String name, String xingzuo, Long tel, String add) {
        this.number = number;
        this.name = name;
        this.xingzuo = xingzuo;
        this.tel = tel;
        this.add = add;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingzuo() {
        return xingzuo;
    }

    public void setXingzuo(String xingzuo) {
        this.xingzuo = xingzuo;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
