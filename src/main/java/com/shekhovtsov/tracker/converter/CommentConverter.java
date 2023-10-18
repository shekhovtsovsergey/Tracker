package com.shekhovtsov.tracker.converter;

import com.shekhovtsov.tracker.dto.CommentDto;
import com.shekhovtsov.tracker.model.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommentConverter {

    public CommentDto entityToDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId().toString());
        commentDto.setText(comment.getText());
        commentDto.setDate(comment.getDate().getTime());
        commentDto.setUserId(comment.getUser().toString());
        return commentDto;
    }

}
