package com.shekhovtsov.tracker.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private String id;
    private String text;
    private long date;
    private String userId;
    private String issueId;

}
