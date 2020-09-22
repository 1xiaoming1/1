package model;

import annotation.Id;
import annotation.ManyToOne;
import annotation.Table;

import java.io.Serializable;
import java.util.Date;

@Table("content")
public class Content implements Serializable {
    @Id
    private int id;
    @ManyToOne(fk = "userId",fkClassName = "model.User")
    private User user;
    @ManyToOne(fk = "videoId",fkClassName = "model.Video")
    private Video video;
    private String content;  //评论内容
    private Date createTime; //评论时间
}
