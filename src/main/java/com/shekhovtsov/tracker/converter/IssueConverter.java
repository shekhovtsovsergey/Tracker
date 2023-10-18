package com.shekhovtsov.tracker.converter;

import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.Issue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IssueConverter {

    public IssueDto entityToDto(Issue issue) {
        return new IssueDto(issue.getId().toString(), issue.getVisibleId(), issue.getTitle(), issue.getDescription(), issue.getStatus().toString(), issue.getPriority(), issue.getAssignee());
    }

    public Issue dtoToEntity(IssueDto issueDto) {
        Issue issue = new Issue();
        issue.setId(Long.valueOf(issueDto.getId()));
        issue.setVisibleId(issueDto.getVisibleId());
        issue.setTitle(issueDto.getTitle());
        issue.setDescription(issueDto.getDescription());
        issue.setStatus(Issue.IssueStatus.valueOf(issueDto.getStatus()));
        issue.setPriority(issueDto.getPriority());
        issue.setAssignee(issueDto.getAssignee());
        return issue;
    }

}
