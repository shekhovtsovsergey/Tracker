package com.shekhovtsov.tracker.dto;

import com.shekhovtsov.tracker.model.Issue;
import com.shekhovtsov.tracker.model.User;
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
    private User user;
    private Issue issue;

}
