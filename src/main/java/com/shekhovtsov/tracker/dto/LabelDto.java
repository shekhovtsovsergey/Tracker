package com.shekhovtsov.tracker.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LabelDto {

    private String id;
    private String value;
    private String domain;


}
