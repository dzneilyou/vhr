package org.sang.bean;

/** 
* @FileName: PoliticsStatus.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:42 
*/
public class PoliticsStatus {
    private Long id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoliticsStatus that = (PoliticsStatus) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public PoliticsStatus(String name) {

        this.name = name;
    }

    public PoliticsStatus() {

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
