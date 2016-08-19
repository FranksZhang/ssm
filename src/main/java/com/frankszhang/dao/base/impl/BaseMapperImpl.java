package com.frankszhang.dao.base.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.frankszhang.dao.base.BaseMapper;

public class BaseMapperImpl<T> implements BaseMapper<T> {
	
	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	
//	private Class<T> entityClass;

	@Override
	public int insert(T t) {
		return sqlSessionTemplate.insert(getStatement("insert"), t);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return sqlSessionTemplate.delete(getStatement("deleteByPrimaryKey"), id);
	}

	@Override
	public int insertSelective(T t) {
		return sqlSessionTemplate.insert(getStatement("insertSelective"), t);
	}

	@Override
	public T selectByPrimaryKey(String id) {
		return sqlSessionTemplate.selectOne(getStatement("selectByPrimaryKey"), id);
	}

	@Override
	public int updateByPrimaryKeySelective(T t) {
		return sqlSessionTemplate.update(getStatement("updateByPrimaryKeySelective"), t);
	}

	@Override
	public int updateByPrimaryKey(T t) {
		return sqlSessionTemplate.update(getStatement("updateByPrimaryKey"), t);
	}

	//这种方法获取到的namespace为com.frankszhang.common.po.User.insert
	/**
	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass() {
		if(this.entityClass == null) {
			return (Class<T>) ((ParameterizedType) this.getClass()
					.getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return this.entityClass;
	}
	**/
	
	protected String getNameSpace() {
		return this.getClass().getInterfaces()[0].toString().split(" ")[1].toString();
	}

	//获取到的namespace为com.frankszhang.dao.UserMapper.insert
	protected String getStatement(String id) {
		return getNameSpace() + "." + id;
	}

}
