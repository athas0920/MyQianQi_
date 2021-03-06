package com.qianqi.bean.VehicleViolationBean;

import java.io.Serializable;

/**
 * Created by p on 2017/3/15.
 */
public class VehicleViolationResult implements Serializable {
    private static final long serialVersionUID =26L;
    public String time;//违章时间
    public double fine;//罚款金额
    public String carNo;//车牌号
    public String cityName;//违章城市名称
    public int recordId;//记录Id
     public int zhinajin;//滞纳金
    public String address;//违章地点
    public String code;//违法行为代码
    public int deductPoint;//扣分
    public String behavior;//违章行为描述
    public boolean canHandle;//是否能够处理
    public double   serviceFee;//服务费
}
