package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entites.Game;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class GameDTO {
    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
