package com.webapp.entity;

import java.util.Date;

public class Hobby {

    enum Level {START, ADVANCED, PROFFECIENCY};

    private String name;
    private Date   startDate;
    private Level  level;

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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}
