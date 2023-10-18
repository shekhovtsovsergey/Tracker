package com.shekhovtsov.tracker.controller;

import com.shekhovtsov.tracker.dto.LabelDto;
import com.shekhovtsov.tracker.service.LabelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class LabelController {

    private final LabelService labelService;

    @GetMapping("/labels")
    public List<LabelDto> getList() {
        return labelService.getAll();
    }

    @GetMapping("/labels/{id}")
    public LabelDto getById(@PathVariable(name = "id") Long id)  {
        return labelService.getById(id);
    }

    @DeleteMapping("/labels/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        labelService.deleteById(id);
    }

    @PutMapping("/labels/{id}")
    public void update(@RequestBody LabelDto labelDto )  {
        labelService.update(labelDto);
    }

    @PostMapping("/labels")
    public void create(@RequestBody LabelDto labelDto)  {
        labelService.create(labelDto);
    }
}
