package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.converter.IssueConverter;
import com.shekhovtsov.tracker.dao.IssueDao;
import com.shekhovtsov.tracker.dto.IssueDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class IssueServiceImpl implements IssueService {

    private final IssueDao issueDao;
    private final IssueConverter issueConverter;



    @Override
    public List<IssueDto> getAllIssues() {
        return issueDao.findAll().stream().map(issueConverter::entityToDto).collect(Collectors.toList());
    }

    @Override
    public List<IssueDto> deleteIssueById(Long id) {
        return null;
    }

    @Override
    public IssueDto createIssue(IssueDto issueDto) {
        return null;
    }

    @Override
    public IssueDto updateIssue(IssueDto issueDto) {
        return null;
    }

    @Override
    public IssueDto getIssueById(Long id) {
        return null;
    }
}
