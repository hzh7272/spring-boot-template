package com.template.service.system.dao;

import com.template.commons.core.base.BasicMapper;
import com.template.service.system.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 系统角色表数据操作接口
 * @author hzh 2018-09-09 00:05
 */
@Mapper
@Repository
public interface RoleMapper extends BasicMapper<Role, Long> {

}
