package com.winterchen.model;

import java.util.Date;

public class Category {
     private int id;
     private String name;
     private String english;
     private int menu;
     private int active;
     private Date creacteddatetime;
     private Date updateddatetime;

     public Category() {
     }

     public Category(int id, String name, String english, int menu, int active, Date creacteddatetime, Date updateddatetime) {
          this.id = id;
          this.name = name;
          this.english = english;
          this.menu = menu;
          this.active = active;
          this.creacteddatetime = creacteddatetime;
          this.updateddatetime = updateddatetime;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getEnglish() {
          return english;
     }

     public void setEnglish(String english) {
          this.english = english;
     }

     public int getMenu() {
          return menu;
     }

     public void setMenu(int menu) {
          this.menu = menu;
     }

     public int getActive() {
          return active;
     }

     public void setActive(int active) {
          this.active = active;
     }

     public Date getCreacteddatetime() {
          return creacteddatetime;
     }

     public void setCreacteddatetime(Date creacteddatetime) {
          this.creacteddatetime = creacteddatetime;
     }

     public Date getUpdateddatetime() {
          return updateddatetime;
     }

     public void setUpdateddatetime(Date updateddatetime) {
          this.updateddatetime = updateddatetime;
     }
}
