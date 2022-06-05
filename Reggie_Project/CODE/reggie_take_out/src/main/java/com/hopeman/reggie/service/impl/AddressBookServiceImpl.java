package com.hopeman.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hopeman.reggie.entity.AddressBook;
import com.hopeman.reggie.mapper.AddressBookMapper;
import com.hopeman.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
