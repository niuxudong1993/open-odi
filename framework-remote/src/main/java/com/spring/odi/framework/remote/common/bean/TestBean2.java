package com.spring.odi.framework.remote.common.bean;

import java.time.LocalDateTime;

public class TestBean2 {
    private Integer testId;
    private String name;
    private LocalDateTime dateTime;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
