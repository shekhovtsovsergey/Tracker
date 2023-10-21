package com.shekhovtsov.tracker.converter;

import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.Issue;
import com.shekhovtsov.tracker.model.Label;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class IssueConverter {

    public IssueDto entityToDto(Issue issue) {
        List<Label> labelList = new ArrayList<>();
        for (Label issueLabel : issue.getLabels()) {
            Label label = new Label(issueLabel.getId(), issueLabel.getValue(), issueLabel.getDomain());
            labelList.add(label);
        }
        return new IssueDto(issue.getId().toString(), issue.getVisibleId(), issue.getTitle(), issue.getDescription(), issue.getStatus(), labelList, issue.getPriority(), issue.getAssignee());

    }

    public Issue dtoToEntity(IssueDto issueDto) {
        Issue issue = new Issue();
        issue.setId(Long.valueOf(issueDto.getId()));
        issue.setVisibleId(issueDto.getVisibleId());
        issue.setTitle(issueDto.getTitle());
        issue.setDescription(issueDto.getDescription());
        issue.setStatus(issue.getStatus());
        issue.setPriority(issueDto.getPriority());
        issue.setAssignee(issueDto.getAssignee());
        return issue;
    }

}
