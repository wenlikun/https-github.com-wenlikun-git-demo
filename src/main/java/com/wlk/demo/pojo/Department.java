package com.wlk.demo.pojo;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department implements Serializable {

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 部门名称
	 */
	private String departmentName;

}
