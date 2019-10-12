package com.zrh.jdps.chain;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public class PersonBookingOrderHandler extends OrderHandler {

    public PersonBookingOrderHandler(OrderHandler next) {
        super(next);
    }

    @Override
    public void handle(OrderRequest orderRequest) {
        if(orderRequest.getOrderType() == OrderType.PERSON_BOOKING){
            System.out.println("订单请求交给普通预约订单处理类进行处理...");
        }else {
            super.handle(orderRequest);
        }
    }
}
