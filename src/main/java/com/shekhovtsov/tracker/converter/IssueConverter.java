package com.shekhovtsov.tracker.converter;

import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.Issue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IssueConverter {

    public IssueDto entityToDto(Issue issue) {
        return new IssueDto(issue.getId(), issue.getVisibleId(), issue.getTitle(), issue.getDescription(), issue.getStatus().toString(), issue.getPriority(), issue.getAssignee());
    }

}
