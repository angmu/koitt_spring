package com.board.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
//DTO
public class BoardVo {

    private int bId;
    private String bName;
    private String bTitle;
    private String bContent;
    private Timestamp bDate;
    private int bHit;
    private int bGroup;
    private int bStep;
    private int bIndent;
}
