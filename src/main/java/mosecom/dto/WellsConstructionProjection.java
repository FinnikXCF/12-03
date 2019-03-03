package mosecom.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class WellsConstructionProjection implements Serializable {

    private Integer id;

    protected int constructionTypeId;

    private int diameter;

    // TODO: Число?
    private String depthFrom;

    // TODO: Число?
    private String depthTo;
}