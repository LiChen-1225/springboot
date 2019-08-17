package com.jt.pojo;

import lombok.Data;
/**
 * tomcat服务器运行时加载.calss文件信息，
 * getset方法就已经被lombok生成了
 */
@Data
public class User{
	private Integer id;
	private String name;
	private	Integer age;
	private String sex;
}
