package com.example.simpleboard.reply.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReplyRequest {

    @NonNull
    private Long postId;

    @NotBlank
    private String userName;

    @NotBlank
    @Size(min = 4, max = 4)
    private String password;

    @NotBlank
    private String title;

    @NotBlank
    @Column(columnDefinition = "TEXT")
    private String content;

}
