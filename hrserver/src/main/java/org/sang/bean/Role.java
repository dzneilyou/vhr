package org.sang.bean;

/** 
* @FileName: Role.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:43 
*/
public class Role {
    private Long id;
    private String name;
    private String nameZh;

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
