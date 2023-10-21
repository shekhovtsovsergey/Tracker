package com.shekhovtsov.tracker.service;

import com.shekhovtsov.tracker.converter.LabelConverter;
import com.shekhovtsov.tracker.dao.LabelDao;
import com.shekhovtsov.tracker.dto.LabelDto;
import com.shekhovtsov.tracker.model.Label;
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
public class LabelServiceImpl implements LabelService{

    private final LabelDao labelDao;
    private final LabelConverter labelConverter;

    @Transactional
    @Override
    public List<LabelDto> getAll() {
        return labelDao.findAll().stream().map(labelConverter::entityToDto).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        labelDao.deleteById(id);
    }

    @Override
    public void create(LabelDto labelDto) {
        Label label = labelConverter.dtoToEntity(labelDto);
        Label savedLabel = labelDao.save(label);
        labelConverter.entityToDto(savedLabel);
    }

    @Override
    public void update(LabelDto labelDto) {
        Label label = labelConverter.dtoToEntity(labelDto);
        Label savedLabel = labelDao.save(label);
        labelConverter.entityToDto(savedLabel);
    }

    @Override
    public LabelDto getById(Long id) {
        Optional<Label> labelOptional = labelDao.findById(id);
        if (labelOptional.isPresent()) {
            Label label = labelOptional.get();
            return labelConverter.entityToDto(label);
        }
        return null;
    }
}