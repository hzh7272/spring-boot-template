package com.template.service.system.dao;

import com.template.commons.core.base.BasicMapper;
import com.template.service.system.model.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 角色权限关联表数据操作接口
 * @author hzh 2018-09-09 00:05
 */
@Mapper
@Repository
public interface RolePermissionMapper extends BasicMapper<RolePermission, Long> {

}
