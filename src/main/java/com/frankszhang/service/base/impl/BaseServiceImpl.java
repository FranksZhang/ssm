package com.frankszhang.service.base.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.frankszhang.dao.base.BaseMapper;
import com.frankszhang.service.base.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	protected BaseMapper<T> baseMapper;
	
	@Override
	public int insert(T t) {
		return baseMapper.insert(t);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insertSelective(T t) {
		return baseMapper.insertSelective(t);
	}

	@Override
	public T selectByPrimaryKey(String id) {
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T t) {
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(T t) {
		return baseMapper.updateByPrimaryKey(t);
	}

	
}
