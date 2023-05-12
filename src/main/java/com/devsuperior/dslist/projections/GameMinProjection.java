package com.devsuperior.dslist.projections;

public interface GameMinProjection {
    Long getId();

    String getTitle();

    int getYear();

    String getImgUrl();

    String getShortDescription();

    Integer getPosition();
}
