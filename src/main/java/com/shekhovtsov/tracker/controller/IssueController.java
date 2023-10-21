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
        return issueService.getAll();
    }

    @GetMapping("/issues/{id}")
    public IssueDto getById(@PathVariable(name = "id") String id)  {
        IssueDto issueDto  = issueService.getById(id);
        System.out.println("Hello " + issueDto);
        return issueDto;
    }

    @DeleteMapping("/issues/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        issueService.deleteById(id);
    }

    @PutMapping("/issues/{id}")
    public void update(@RequestBody IssueDto issueDto )  {
        issueService.update(issueDto);
    }

    @PostMapping("/issues")
    public void create(@RequestBody IssueDto issueDto)  {
        issueService.create(issueDto);
    }

}
