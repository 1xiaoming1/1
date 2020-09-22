package model;

import annotation.Id;
import annotation.ManyToOne;
import annotation.Table;

import java.io.Serializable;
@Table("video")
public class Video implements Serializable {
    @Id
    private int id;
    @ManyToOne(fk = "courseId",fkClassName = "model.Course")
    private Course course;
    private String url;

    public Video(int id, Course course, String url) {
        this.id = id;
        this.course = course;
        this.url = url;
    }

    public Video() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
