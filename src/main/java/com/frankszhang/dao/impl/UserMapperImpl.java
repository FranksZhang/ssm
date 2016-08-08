package com.frankszhang.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

import com.frankszhang.common.po.User;
import com.frankszhang.dao.UserMapper;

public class UserMapperImpl<User> implements UserMapper{

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(com.frankszhang.common.po.User record) {
		return sqlSessionTemplate.insert(getStatement("insert"),record);
	}

	@Override
	public int insertSelective(com.frankszhang.common.po.User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public com.frankszhang.common.po.User selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(com.frankszhang.common.po.User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(com.frankszhang.common.po.User record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	protected String getStatement(String id) {
		return getEntityClass().getName() + "Mapper" + id;
	}
	
	@SuppressWarnings("unchecked")
	private Class<User> getEntityClass() {
		return (Class<User>) ((ParameterizedType)this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

}
