package com.winterchen.model;

import java.util.Date;

public class ArticleDomain {
     private int id;
     private String title;
     private String images;
     private String content;
     private int sourceid;
     private String author;
     private String keyword;
     private int caegory_id;
     private int pageviews;
     private int status;
     private int userId;
     private String collecturl;
     private int look;
     private Date creacteddatetime;
     private Date updateddatetime;

     public ArticleDomain() {
     }

     public ArticleDomain(int id, String title, String images, String content, int sourceid, String author, String keyword, int caegory_id, int pageviews, int status, int userId, String collecturl, int look, Date creacteddatetime, Date updateddatetime) {
          this.id = id;
          this.title = title;
          this.images = images;
          this.content = content;
          this.sourceid = sourceid;
          this.author = author;
          this.keyword = keyword;
          this.caegory_id = caegory_id;
          this.pageviews = pageviews;
          this.status = status;
          this.userId = userId;
          this.collecturl = collecturl;
          this.look = look;
          this.creacteddatetime = creacteddatetime;
          this.updateddatetime = updateddatetime;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getImages() {
          return images;
     }

     public void setImages(String images) {
          this.images = images;
     }

     public String getContent() {
          return content;
     }

     public void setContent(String content) {
          this.content = content;
     }

     public int getSourceid() {
          return sourceid;
     }

     public void setSourceid(int sourceid) {
          this.sourceid = sourceid;
     }

     public String getAuthor() {
          return author;
     }

     public void setAuthor(String author) {
          this.author = author;
     }

     public String getKeyword() {
          return keyword;
     }

     public void setKeyword(String keyword) {
          this.keyword = keyword;
     }

     public int getCaegory_id() {
          return caegory_id;
     }

     public void setCaegory_id(int caegory_id) {
          this.caegory_id = caegory_id;
     }

     public int getPageviews() {
          return pageviews;
     }

     public void setPageviews(int pageviews) {
          this.pageviews = pageviews;
     }

     public int getStatus() {
          return status;
     }

     public void setStatus(int status) {
          this.status = status;
     }

     public int getUserId() {
          return userId;
     }

     public void setUserId(int userId) {
          this.userId = userId;
     }

     public String getCollecturl() {
          return collecturl;
     }

     public void setCollecturl(String collecturl) {
          this.collecturl = collecturl;
     }

     public int getLook() {
          return look;
     }

     public void setLook(int look) {
          this.look = look;
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
