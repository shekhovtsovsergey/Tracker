package com.shekhovtsov.tracker.dao;

import com.shekhovtsov.tracker.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Long> {
    List<Comment> findByIssueId(Long issueId);
}
