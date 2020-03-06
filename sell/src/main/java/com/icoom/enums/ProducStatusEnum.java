package com.icoom.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ProducStatusEnum {
    UP(0,"在线"),
    DOWN(1,"下架");

    private Integer code;

    private String message;

    ProducStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }


}
