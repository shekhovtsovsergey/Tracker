package com.shekhovtsov.tracker.controller;


import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.service.IssueService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class IssueController {

    private final IssueService issueService;

    @GetMapping("/issues")
    public List<IssueDto> getList() {
        return issueService.getAllIssues();
    }

    @GetMapping("/api/v1/issues/{id}")
    public IssueDto getById(@PathVariable(name = "id") Long id)  {
        return issueService.getIssueById(id);
    }

    @DeleteMapping("/api/v1/issues/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        issueService.deleteIssueById(id);
    }

    @PutMapping("/api/v1/issues/{id}")
    public IssueDto update(@RequestBody IssueDto issueDto )  {
        return issueService.updateIssue(issueDto);
    }

    @PostMapping("/api/v1/issues")
    public IssueDto create(@RequestBody IssueDto issueDto)  {
        return issueService.createIssue(issueDto);
    }

}
