package com.shekhovtsov.tracker.converter;

import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.Issue;

import java.awt.print.Book;

public class IssueConverter {


    public IssueDto entityToDto(Issue issue) {
        return new IssueDto(issue.getId(), issue.getVisibleId(), issue.getTitle(), issue.getDescription(), issue.getStatus(), issue.getPriority(), issue.getLabels(), issue.getAssignee());
    }
}
