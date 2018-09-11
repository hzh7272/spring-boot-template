package com.template.service.system.model;

import com.template.commons.core.base.BasicModel;
import com.template.commons.core.generator.annotation.Table;
import com.template.commons.core.generator.annotation.TableColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户角色关联数据模型
 * @author hzh 2018/9/8 下午11:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "user_role", comment = "用户角色关联表", updateAble = true)
public class UserRole extends BasicModel {

	@TableColumn(primaryKey = true, autoIncrease = true, notNull = true, comment = "用户角色关联ID")
	private Long id;
	@TableColumn(comment = "系统用户ID")
	private Long userId;
	@TableColumn(comment = "系统角色ID")
	private Long roleId;
}
