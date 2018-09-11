package com.template.service.system.dao;

import com.template.commons.core.base.BasicMapper;
import com.template.service.system.model.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 系统权限表数据操作接口
 * @author hzh 2018-09-09 00:08
 */
@Mapper
@Repository
public interface PermissionMapper extends BasicMapper<Permission, Long> {

}
