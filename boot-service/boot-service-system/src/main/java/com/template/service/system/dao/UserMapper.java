package com.template.service.system.dao;

import com.template.commons.core.base.BasicMapper;
import com.template.service.system.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 系统用户表数据操作接口
 * @author hzh 2018-09-09 00:02
 */
@Mapper
@Repository
public interface UserMapper extends BasicMapper<User, Long> {

}
