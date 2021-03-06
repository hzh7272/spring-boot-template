package com.template.service.system.model;

import com.template.commons.core.base.BasicModel;
import com.template.commons.core.generator.annotation.Table;
import com.template.commons.core.generator.annotation.TableColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统角色数据模型
 * @author hzh 2018/9/7 15:41
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "role", comment = "系统角色表")
public class Role extends BasicModel {

    @TableColumn(primaryKey = true, autoIncrease = true, notNull = true, comment = "系统角色ID")
    private Long id;
    @TableColumn(notNull = true, length = 32, comment = "角色名称")
    private String name;
    @TableColumn(notNull = true, comment = "角色编码")
    private String code;
    @TableColumn(notNull = true, defaultValue = "99", comment = "角色等级")
    private Integer level;
}
