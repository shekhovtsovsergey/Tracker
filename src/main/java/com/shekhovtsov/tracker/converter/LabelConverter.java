package com.shekhovtsov.tracker.converter;

import com.shekhovtsov.tracker.dto.LabelDto;
import com.shekhovtsov.tracker.model.Label;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LabelConverter {

    public LabelDto entityToDto(Label label) {
        return new LabelDto(label.getId(), label.getValue(), label.getDomain());
    }

    public Label dtoToEntity(LabelDto labelDto) {
        return new Label(labelDto.getId(), labelDto.getValue(), labelDto.getDomain());
    }

}
