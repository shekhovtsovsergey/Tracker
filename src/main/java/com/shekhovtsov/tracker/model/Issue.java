package com.shekhovtsov.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "issues")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String visibleId;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private IssueStatus status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @ManyToMany
    private List<Label> labels;

    @OneToOne
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
