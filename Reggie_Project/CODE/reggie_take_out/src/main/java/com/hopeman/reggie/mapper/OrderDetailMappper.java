package com.hopeman.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hopeman.reggie.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMappper extends BaseMapper<OrderDetail> {
}
