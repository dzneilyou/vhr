package org.sang.bean;

/** 
* @FileName: RespBean.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:42 
*/
public class RespBean {
    private String status;
    private String msg;

    public RespBean() {
    }

    public RespBean(String status, String msg) {

        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
