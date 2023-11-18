package com.asmprojetos.lojagame.dto;

import com.asmprojetos.lojagame.entities.Game;
import com.asmprojetos.lojagame.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;

    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
