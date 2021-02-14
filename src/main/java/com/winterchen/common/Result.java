package com.winterchen.common;

import java.io.Serializable;

public class Result {
     private Integer code;
     private Message message;
     private Object  object;

     public Result(Integer code, Message message, Object object) {
          this.code = code;
          this.message = message;
          this.object = object;
     }

     public Integer getCode() {
          return code;
     }

     public void setCode(Integer code) {
          this.code = code;
     }

     public String getMessage() {
          return message.toString();
     }

     public void setMessage(Message message) {
          this.message = message;
     }

     public Object getObject() {
          return object;
     }

     public void setObject(Object object) {
          this.object = object;
     }
}
