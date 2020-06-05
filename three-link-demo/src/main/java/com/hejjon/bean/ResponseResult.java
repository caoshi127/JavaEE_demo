package com.hejjon.bean;

/**
 * Created by CaoShi on 2020/5/21 21:56
 */
public class ResponseResult {


    private Integer code;

    private String smsg;

    private String emsg;

    private Object data;


    public ResponseResult() {
    }

    public ResponseResult(Integer code, String smsg, String emsg, Object data) {
        this.code = code;
        this.smsg = smsg;
        this.emsg = emsg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getSmsg() {
        return smsg;
    }

    public void setSmsg(String smsg) {
        this.smsg = smsg;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
