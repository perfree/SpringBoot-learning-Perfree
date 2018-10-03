package com.perfree.multipledatasource.pojo;

/**
 * @ClassName User
 * @Description TODO(user实体类)
 * @Author Perfree
 * @Date 2018/10/3 21:19
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
