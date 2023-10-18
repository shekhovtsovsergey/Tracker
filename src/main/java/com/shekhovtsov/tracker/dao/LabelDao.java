package com.shekhovtsov.tracker.dao;

import com.shekhovtsov.tracker.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelDao extends JpaRepository<Label, Long> {

}
