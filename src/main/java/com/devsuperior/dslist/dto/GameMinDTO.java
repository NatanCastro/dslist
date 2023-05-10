package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entites.Game;
import lombok.Getter;

@Getter
public class GameMinDTO {
    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {}

    public GameMinDTO(Game  entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}
