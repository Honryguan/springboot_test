package com.gg.test01;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gg.bean.User;

/**
* @author 
* @version 1.0
* @date 2018年4月23日
* 说明：
*/
@RestController
public class HelloWorldTest {
	/**
	 * 返回json请求格式数据
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	/**
	 * 返回对象
	 */
	@RequestMapping("pojo")
	public User showUser() {
		User user = new User();
		user.setId(22);
		user.setSex("男");
		user.setUsername("张三丰");
		user.setAddress("武汉");
		user.setBirthday(new Date());
		return user;
	}
	
	/**
	 * 集合对象
	 */
	@RequestMapping("maps")
	public Map<String,Object> showMaps(){
		Map<String, Object> map = new HashMap<>();
		map.put("name", "张无忌");
		map.put("age", "11");
		return map;
	}
	/**
	 * list
	 */
	@RequestMapping("list")
	public List<User> showList() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(22);
		user.setSex("男");
		user.setUsername("张三丰");
		user.setAddress("武汉");
		user.setBirthday(new Date());
		User user2 = new User();
		user2.setId(22);
		user2.setSex("男");
		user2.setUsername("张三丰");
		user2.setAddress("武汉");
		user2.setBirthday(new Date());
		list.add(user);
		list.add(user);
		return list;
	}
}
