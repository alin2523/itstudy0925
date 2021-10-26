package jp.itstudy.crm;

import java.math.BigDecimal;

public class Staff {
    private BigDecimal salary;
    private Integer number;
    private String name;
    Integer age;
    String gender;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Staff() {
    }

    public Staff(Integer number, String name, Integer age, String gender) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void work(){
        System.out.println("正在工作");
    }
}
