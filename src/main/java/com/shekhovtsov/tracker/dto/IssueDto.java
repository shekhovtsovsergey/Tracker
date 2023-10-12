package com.shekhovtsov.tracker.dto;

import com.shekhovtsov.tracker.model.Issue;
import com.shekhovtsov.tracker.model.IssueStatus;
import com.shekhovtsov.tracker.model.Label;
import com.shekhovtsov.tracker.model.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssueDto {

    private String id;
    private String visibleId;
    private String title;
    private String description;
    private IssueStatus status;
    private Issue.Priority priority;
    private List<Label> labels;
    private User assignee;

}
