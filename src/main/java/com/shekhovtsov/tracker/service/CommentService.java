package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.dto.CommentDto;

import java.util.List;

public interface CommentService {

    void deleteById(Long id);
    void create (CommentDto commentDto,String issueVisibleId);
    void update (CommentDto commentDto);
    List<CommentDto> getById (String id);
}
