package com.example.web.vo;

import java.io.Serializable;

/**
 * Response JsonResult for RESTful <br>
 * 封装 返回Json 格式数据
 *
 * @author cc
 **/

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -4699713095477151086L;

    /**
     * 数据
     */
    private T data;
    /**
     * 信息
     */
    private String errmsg;
    /**
     * 状态码
     */
    private int errno;

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public JsonResult() {
        super();
    }

    public JsonResult(T data, String errmsg, int errno) {
        this.data = data;
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public JsonResult(String errmsg) {
        this.errmsg = errmsg;
        this.errno = 101;
    }

    public JsonResult(T data) {
        this.data = data;
        this.errno = 101;
    }
}