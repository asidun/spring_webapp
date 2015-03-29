package com.webapp.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

public class Hobby {

    @NotEmpty(message = "Name is mandatory")
    private String name;

    private String description;
    private Date   startDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

