package com.ry.aigou;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.xml.crypto.Data;

public class AjaxResult {

    private Boolean success=true;
    private String msg;
    private Object data;

    public static AjaxResult success(Object data){
        return new AjaxResult(true,"操作成功",data);
    }
    public static AjaxResult error(String msg){
        return new AjaxResult(false,msg);
    }

    public AjaxResult(Boolean success, String msg,Object data) {
        this.success = success;
        this.msg = msg;
        this.data= data;
    }
    public AjaxResult(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public AjaxResult() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
