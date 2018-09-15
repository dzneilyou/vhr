package org.sang.bean;

import java.util.Date;

/** 
* @FileName: MsgContent.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:42 
*/
public class MsgContent {
    private Long id;
    private String message;
    private String title;
    private Date createDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
