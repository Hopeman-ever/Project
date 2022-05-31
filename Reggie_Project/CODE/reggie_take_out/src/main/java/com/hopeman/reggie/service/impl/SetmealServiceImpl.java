package com.hopeman.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hopeman.reggie.entity.Setmeal;
import com.hopeman.reggie.mapper.SetmaelMapper;
import com.hopeman.reggie.service.SetmealService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmaelMapper, Setmeal> implements SetmealService {
}
