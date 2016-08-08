package com.frankszhang.service;

import com.frankszhang.common.po.User;

public interface UserService {

	/**
	 * 插入一个对象
	 * @param record
	 * @return
	 */
	int insert(User record);
}
