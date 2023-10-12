package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.IssueStatus;

import java.util.List;

public interface IssueService {

    List<IssueDto> getAllIssues();
    List<IssueDto> deleteIssueById(Long id);
    IssueDto createIssue (IssueDto issueDto);
    IssueDto updateIssue (IssueDto issueDto);
    IssueDto getIssueById (Long id);

}
