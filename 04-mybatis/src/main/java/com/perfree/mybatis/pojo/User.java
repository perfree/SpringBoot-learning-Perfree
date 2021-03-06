package com.perfree.mybatis.pojo;

/**
 * @ClassName User
 * @Description TODO(User实体类)
 * @Author Perfree
 * @Date 2018/10/3 7:13
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
