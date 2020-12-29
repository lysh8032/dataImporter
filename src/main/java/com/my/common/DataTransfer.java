package com.my.common;

import lombok.Data;

@Data
public class DataTransfer {

    private Integer showCount;
    private Integer currentPage;
    private String KEYWORDS;
    private String orderName;
    private String orderSort;
    private String token;

}
