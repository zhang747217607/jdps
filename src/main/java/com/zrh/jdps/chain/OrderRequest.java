package com.zrh.jdps.chain;

/**
 * <p>
 *  订单请求
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public class OrderRequest {

    private Integer orderType;

    private Object params;

    public OrderRequest(Integer orderType, Object params) {
        this.orderType = orderType;
        this.params = params;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }
}
