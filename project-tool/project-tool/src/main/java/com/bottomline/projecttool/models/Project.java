package com.bottomline.projecttool.models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Calendar created_at;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Calendar end_date) {
        this.end_date = end_date;
    }

    public String getProject_identifier() {
        return project_identifier;
    }

    public void setProject_identifier(String project_identifier) {
        this.project_identifier = project_identifier;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Calendar getStart_date() {
        return start_date;
    }

    public void setStart_date(Calendar start_date) {
        this.start_date = start_date;
    }

    public Calendar getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Calendar updated_at) {
        this.updated_at = updated_at;
    }

    private Calendar end_date;
    private String project_identifier;
    private String project_name;
    private Calendar start_date;
    private Calendar updated_at;
}
