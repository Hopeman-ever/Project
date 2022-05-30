package com.hopeman.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hopeman.reggie.entity.Category;
import com.hopeman.reggie.mapper.CategoryMapper;
import com.hopeman.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
