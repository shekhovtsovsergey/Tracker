package com.shekhovtsov.tracker.controller;

import com.shekhovtsov.tracker.dto.CommentDto;
import com.shekhovtsov.tracker.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class CommentController {

    private final CommentService commentService;


    @GetMapping("/comments")
    public List<CommentDto> getById(@RequestParam String issueVisibleId, Authentication auth)  {
        return commentService.getById(issueVisibleId);
    }

    @DeleteMapping("/comments/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        commentService.deleteById(id);
    }

    @PutMapping("/comments/{id}")
    public void update(@RequestBody CommentDto commentDto )  {
        commentService.update(commentDto);
    }

    @PostMapping("/comments")
    public void create(@RequestBody CommentDto commentDto, String issueVisibleId, Authentication auth)  {
        commentService.create(commentDto,issueVisibleId);
    }

}