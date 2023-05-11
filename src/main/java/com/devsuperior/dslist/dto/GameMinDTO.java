package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entites.Game;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class GameMinDTO {
    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
