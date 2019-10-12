package com.zrh.jdps.chain;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public class WorkerUseOrderHandler extends OrderHandler {

    public WorkerUseOrderHandler(OrderHandler next) {
        super(next);
    }

    @Override
    public void handle(OrderRequest orderRequest) {
        if(orderRequest.getOrderType() == OrderType.WORKER_USE){
            System.out.println("订单请求交给巡检用车订单处理类进行处理...");
        }else {
            super.handle(orderRequest);
        }
    }
}
