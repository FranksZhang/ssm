package com.frankszhang.dao.impl;

import org.junit.Test;
import org.springframework.stereotype.Repository;

import com.frankszhang.common.po.User;
import com.frankszhang.dao.UserMapper;
import com.frankszhang.dao.base.impl.BaseMapperImpl;

@Repository
public class UserMapperImpl extends BaseMapperImpl<User> implements UserMapper{

//	@Override
//	public int insert(com.frankszhang.common.po.User record) {
//		return sqlSessionTemplate.insert("com.frankszhang.dao.UserMapper.insert",record);
//	}

	@Test
	public void test() {
		System.out.println(getNameSpace());
		User user = new User();
		user.setId("9");
		user.setName("qw");
		user.setPassword("123");
		int i = insert(user);
		System.out.println(i);
	}
}
