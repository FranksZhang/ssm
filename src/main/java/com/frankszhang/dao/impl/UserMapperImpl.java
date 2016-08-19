package com.frankszhang.dao.impl;

import org.springframework.stereotype.Repository;

import com.frankszhang.common.po.User;
import com.frankszhang.dao.UserMapper;
import com.frankszhang.dao.base.impl.BaseMapperImpl;

@Repository
public class UserMapperImpl extends BaseMapperImpl<User> implements UserMapper{

}
