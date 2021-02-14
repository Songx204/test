package com.winterchen.common;

public enum Message {
     SUCCESS("成功");

     private String mapping;

     Message(String mapping) {
          this.mapping = mapping;
     }


     @Override
     public String toString() {
          return this.mapping;
     }
}
