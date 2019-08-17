package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "jdbc")//批量赋值
@PropertySource("classpath:/properties/jdbc.properties")//将文件交给spring容器管理。
public class JDBCController {
	private String driver;
	private String name;
	private String password;
	
	
	
//	@Value(value="${jdbc.driver}")
//	private String driver;
//	@Value(value="${jdbc.name}")
//	private String name;
//	@Value(value="${jdbc.password}")
//	private String password;
	
	public String getDriver() {
		return driver;
	}



	public void setDriver(String driver) {
		this.driver = driver;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@RequestMapping("/getMsg")
	@ResponseBody
	public String getMsg() {
		return "服务器返回数据"+driver+"|"+name+"|"+password+"|";
	}
	
}
