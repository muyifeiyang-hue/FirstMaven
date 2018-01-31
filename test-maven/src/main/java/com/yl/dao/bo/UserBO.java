/**
 * All rights reserved by XinGuoDu Inc.
 */
package com.yl.dao.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jiuzhou.center.common.bo.AbstractBaseBO;
import com.jiuzhou.center.common.mapper.IBaseMapper;
import com.yl.dao.mapper.UserMapper;
import com.yl.entity.UserEntity;


/**
 * 业务处理.<p>
 * @author yanglei
 * @Date 2018-01-31 15:36:58
 * @since 1.0
 */
@Component
public class UserBO extends AbstractBaseBO<UserEntity> {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
    protected IBaseMapper<UserEntity> getMapper() {
	    return userMapper;
    }
}
