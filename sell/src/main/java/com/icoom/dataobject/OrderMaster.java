package com.icoom.dataobject;

import com.icoom.enums.OrderStatusEnum;
import com.icoom.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    //订单id
    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    //订单总额
    private BigDecimal orderAmount;

    //订单状态
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

//    //这个注解可以忽略掉这个属性或者变量
//    @Transient
//    private List<OrderDetail> orderDetailList;
//    方法一(一般不这么干)
}
