package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.dto.IssueDto;

import java.util.List;

public interface IssueService {

    List<IssueDto> getAll();
    void deleteById(Long id);
    void create (IssueDto issueDto);
    void update (IssueDto issueDto);
    IssueDto getById (String id);

}
