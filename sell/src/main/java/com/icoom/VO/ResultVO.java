package com.icoom.VO;

import lombok.Data;

import java.util.List;

@Data
public class ResultVO<T>{
    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体信息
    private T data;
}
