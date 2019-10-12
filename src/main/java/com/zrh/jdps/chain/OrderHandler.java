package com.zrh.jdps.chain;

/**
 * <p>
 * 订单处理
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public abstract class OrderHandler {

    private OrderHandler next;

    public OrderHandler(OrderHandler next) {
        this.next = next;
    }

    public void handle(OrderRequest orderRequest){
        if(this.next != null){
            next.handle(orderRequest);
        }
    }
}
