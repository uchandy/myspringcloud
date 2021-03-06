package com.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable {
    private Long   deptno;//主键
    private String     dname;//部门名称
    private String     db_source;//来自哪个数据库，微服务架构可以一个服务对应一个数据库。


}
