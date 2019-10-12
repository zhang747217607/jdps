package com.zrh.jdps.chain;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public class EnterpriseUseOrderHandler extends OrderHandler {


    public EnterpriseUseOrderHandler(OrderHandler next) {
        super(next);
    }

    @Override
    public void handle(OrderRequest orderRequest) {
        if(orderRequest.getOrderType() == OrderType.ENTERPRISE_USE){
            System.out.println("订单请求交给企业用车订单处理类进行处理...");
        }else {
            super.handle(orderRequest);
        }
    }


}
