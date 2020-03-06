package com.icoom.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.icoom.dataobject.OrderDetail;
import com.icoom.enums.OrderStatusEnum;
import com.icoom.enums.PayStatusEnum;
import com.icoom.utils.serializer.Date2LongServializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    //订单总额
    private BigDecimal orderAmount;

    //订单状态
    private Integer orderStatus;

    private Integer payStatus;

    //创建时间
    @JsonSerialize(using = Date2LongServializer.class)
    private Date createTime;

    //更新时间
    @JsonSerialize(using = Date2LongServializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
