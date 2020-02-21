package net.renfei.apicenter.request;

import java.io.Serializable;

public class DemoRquest extends BaseRquest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
