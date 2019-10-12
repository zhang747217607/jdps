package com.zrh.jdps.chain;

/**
 * <p>
 * 订单类型  普通即时用车 、 普通预约用车 、 巡检用车 、 企业用车
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/10/12
 */
public class OrderType {

    /**
     * 普通即时用车
     */
    public static final int PERSON_IMMEDIATE = 1;

    /**
     * 普通预约用车
     */
    public static final int PERSON_BOOKING = 2;
    /**
     * 巡检用车
     */
    public static final int WORKER_USE = 3;
    /**
     * 企业用车
     */
    public static final int ENTERPRISE_USE = 4;


}
