package com.hopeman.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hopeman.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMappper extends BaseMapper<Dish> {
}
