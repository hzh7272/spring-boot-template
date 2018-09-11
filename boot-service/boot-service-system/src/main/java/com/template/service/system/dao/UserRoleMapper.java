package com.template.service.system.dao;


import com.template.commons.core.base.BasicMapper;
import com.template.service.system.model.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户角色关联表数据操作接口
 * @author hzh 2018-09-09 00:03
 */
@Mapper
@Repository
public interface UserRoleMapper extends BasicMapper<UserRole, Long> {

}
