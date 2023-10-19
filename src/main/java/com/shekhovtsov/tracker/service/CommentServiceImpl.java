package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.converter.CommentConverter;
import com.shekhovtsov.tracker.dao.CommentDao;
import com.shekhovtsov.tracker.dto.CommentDto;
import com.shekhovtsov.tracker.dto.IssueDto;
import com.shekhovtsov.tracker.model.Comment;
import com.shekhovtsov.tracker.model.Issue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommentServiceImpl implements CommentService {

    private final CommentDao commentDao;
    private final IssueService issueService;
    private final CommentConverter commentConverter;


    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void create(CommentDto commentDto, String issueVisibleId) {

    }

    @Override
    public void update(CommentDto commentDto) {

    }

    @Override
    public List<CommentDto> getById(String id) {
        IssueDto issue = issueService.getById(id);
        List<Comment> comments = commentDao.findByIssueId(Long.parseLong(issue.getId()));
        List<CommentDto> commentDtos = new ArrayList<>();
        for (Comment comment : comments) {
            commentDtos.add(commentConverter.entityToDto(comment));
        }
        return commentDtos;
    }
}
