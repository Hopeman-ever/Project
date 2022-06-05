package com.hopeman.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hopeman.reggie.entity.ShoppingCart;
import com.hopeman.reggie.mapper.ShoppingCartMapper;
import com.hopeman.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
