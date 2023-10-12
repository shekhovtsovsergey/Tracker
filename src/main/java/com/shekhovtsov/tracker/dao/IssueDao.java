package com.shekhovtsov.tracker.dao;

import com.shekhovtsov.tracker.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueDao extends JpaRepository<Issue, Long> {


}