package com.devsuperior.dslist.projections;

public interface GameMinProjection {
    Long getId();

    String getTitle();

    int getGameYear();

    String getImgUrl();

    String getShortDescription();

    Integer getPosition();
}
