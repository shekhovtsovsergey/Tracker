package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.converter.IssueConverter;
import com.shekhovtsov.tracker.dao.IssueDao;
import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.Issue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class IssueServiceImpl implements IssueService {

    private final IssueDao issueDao;
    private final IssueConverter issueConverter;

    @Transactional
    @Override
    public List<IssueDto> getAll() {
        return issueDao.findAll().stream().map(issueConverter::entityToDto).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        issueDao.deleteById(id);
    }

    @Override
    public void create(IssueDto issueDto) {
        Issue issue = issueConverter.dtoToEntity(issueDto);
        Issue savedIssue = issueDao.save(issue);
        issueConverter.entityToDto(savedIssue);
    }

//    @Override
//    public void update(IssueDto issueDto) {
//        Issue issue = issueConverter.dtoToEntity(issueDto);
//        Issue savedIssue = issueDao.save(issue);
//        issueConverter.entityToDto(savedIssue);
//    }

    @Transactional
    @Override
    public void update(IssueDto issueDto) {
        Issue issue = issueDao.findByVisibleId(issueDto.getId());
        if (issue == null) {
            throw new RuntimeException("Issue not found");
        }
        if (issueDto.getVisibleId() != null) {
            issue.setVisibleId(issueDto.getVisibleId());
        }
        if (issueDto.getTitle() != null) {
            issue.setTitle(issueDto.getTitle());
        }
        if (issueDto.getDescription() != null) {
            issue.setDescription(issueDto.getDescription());
        }
        if (issueDto.getStatus() != null) {
            issue.setStatus(issueDto.getStatus());
        }
        if (issueDto.getLabels() != null) {
            issue.setLabels(issueDto.getLabels());
        }
        if (issueDto.getPriority() != null) {
            issue.setPriority(issueDto.getPriority());
        }
        if (issueDto.getAssignee() != null) {
            issue.setAssignee(issueDto.getAssignee());
        }
        Issue savedIssue = issueDao.save(issue);
        issueConverter.entityToDto(savedIssue);
    }



    @Transactional
    @Override
    public IssueDto getById(String id) {
        System.out.println(issueDao.findByVisibleId(id));
        Optional<Issue> issueOptional = Optional.ofNullable(issueDao.findByVisibleId(id));
        if (issueOptional.isPresent()) {
            Issue issue = issueOptional.get();
            return issueConverter.entityToDto(issue);
        }
        return null;
    }
}
