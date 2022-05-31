package com.hopeman.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hopeman.reggie.entity.Dish;
import com.hopeman.reggie.mapper.DishMappper;
import com.hopeman.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl extends ServiceImpl<DishMappper, Dish> implements DishService {
}
