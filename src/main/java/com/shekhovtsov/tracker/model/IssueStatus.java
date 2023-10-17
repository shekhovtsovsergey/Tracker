package com.shekhovtsov.tracker.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Getter
@RequiredArgsConstructor
public enum IssueStatus {

    NEW, ANALYSIS, DEVELOPMENT, REVIEW, DEPLOYMENT, TESTING, FEEDBACK, VERIFIED, DONE, CLOSED;

    static {
        NEW.previous = List.of(CLOSED);
        NEW.next = List.of(IssueStatus.ANALYSIS, IssueStatus.DEVELOPMENT);

        ANALYSIS.previous = List.of(IssueStatus.CLOSED);
        ANALYSIS.next = List.of(IssueStatus.DEVELOPMENT);

        DEVELOPMENT.previous = List.of(IssueStatus.ANALYSIS);
        DEVELOPMENT.next = List.of(IssueStatus.REVIEW);

        REVIEW.previous = List.of(IssueStatus.DEPLOYMENT);
        REVIEW.next = List.of(IssueStatus.DEPLOYMENT);

        DEPLOYMENT.previous = List.of(IssueStatus.REVIEW);
        DEPLOYMENT.next = List.of(IssueStatus.TESTING);

        TESTING.previous = List.of(IssueStatus.FEEDBACK, IssueStatus.DEVELOPMENT);
        TESTING.next = List.of(IssueStatus.VERIFIED);

        FEEDBACK.previous = List.of(IssueStatus.DEVELOPMENT);
        FEEDBACK.next = List.of(IssueStatus.TESTING);

        VERIFIED.previous = List.of(IssueStatus.TESTING);
        VERIFIED.next = List.of(IssueStatus.DONE);

        DONE.previous = List.of(IssueStatus.ANALYSIS, IssueStatus.TESTING);
        DONE.next = List.of();

        CLOSED.previous = List.of();
        CLOSED.next = List.of(IssueStatus.NEW);
    }

    @Getter
    private List<IssueStatus> previous;

    @Getter
    private List<IssueStatus> next;

}
