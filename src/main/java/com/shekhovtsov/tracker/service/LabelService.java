package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.dto.LabelDto;

import java.util.List;

public interface LabelService {

    List<LabelDto> getAll();
    void deleteById(Long id);
    void create (LabelDto labelDto);
    void update (LabelDto labelDto);
    LabelDto getById (Long id);

}
