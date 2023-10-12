package com.shekhovtsov.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
public class Issue {

    private String id;
    private String visibleId;
    private String title;
    private String description;
    private IssueStatus status;
    private Priority priority;
    private List<Label> labels;
    private User assignee;


    @AllArgsConstructor
    public enum Priority {
        VERY_LOW, LOW, MEDIUM, HIGH, VERY_HIGH;
    }


    @AllArgsConstructor
    public enum IssueStatus {
        OPEN, IN_PROGRESS, CLOSED;
    }

}
