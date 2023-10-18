package com.shekhovtsov.tracker.dto;

import com.shekhovtsov.tracker.model.Issue;
import com.shekhovtsov.tracker.model.User;
import lombok.*;

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
    private String status;
    private Issue.Priority priority;
    private User assignee;

}
