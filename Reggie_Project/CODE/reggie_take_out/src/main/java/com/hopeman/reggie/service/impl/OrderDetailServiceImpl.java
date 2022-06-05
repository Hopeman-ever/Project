package com.hopeman.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hopeman.reggie.entity.OrderDetail;
import com.hopeman.reggie.mapper.OrderDetailMappper;
import com.hopeman.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMappper, OrderDetail> implements OrderDetailService {
}
