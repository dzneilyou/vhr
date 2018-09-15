package org.sang.bean;

/** 
* @FileName: Nation.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:42 
*/
public class Nation {
    private Long id;
    private String name;

    public Nation(String name) {
        this.name = name;
    }

    public Nation() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nation nation = (Nation) o;

        return name != null ? name.equals(nation.name) : nation.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
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
