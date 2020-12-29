package com.my.base.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.base.service.IBaseService;

public class BaseServiceImpl<K extends BaseMapper<T>, T> extends ServiceImpl<K, T> implements IBaseService<T> {

}
