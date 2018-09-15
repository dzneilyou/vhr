package org.sang.bean;

/** 
* @FileName: MenuMeta.java
* @Description: 用一句话描述这个类的作用
* @author dznei
* @date 2018/9/14 20:42 
*/
public class MenuMeta {

    private boolean keepAlive;
    private boolean requireAuth;

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public boolean isRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
