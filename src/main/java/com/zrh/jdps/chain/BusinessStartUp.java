package com.zrh.jdps.chain;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public class BusinessStartUp {

    public OrderHandler buildChain(){
        return new PersonImmediateOrderHandler(
                new PersonBookingOrderHandler(
                        new WorkerUseOrderHandler(
                                new EnterpriseUseOrderHandler(null))));
    }

    public static void main(String[] args) {


        Map<String,Object> params = new HashMap<>(0);
        params.put("userId","1001");
        params.put("vehicleNo","沪A88888");

        OrderRequest orderRequest1 = new OrderRequest(OrderType.PERSON_IMMEDIATE,params);
        OrderRequest orderRequest2 = new OrderRequest(OrderType.PERSON_BOOKING,params);
        OrderRequest orderRequest3 = new OrderRequest(OrderType.WORKER_USE,params);
        OrderRequest orderRequest4 = new OrderRequest(OrderType.ENTERPRISE_USE,params);


        BusinessStartUp businessStartUp = new BusinessStartUp();
        OrderHandler orderHandler = businessStartUp.buildChain();
        orderHandler.handle(orderRequest1);
        orderHandler.handle(orderRequest2);
        orderHandler.handle(orderRequest3);
        orderHandler.handle(orderRequest4);
    }
}
