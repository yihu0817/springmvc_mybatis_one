package com.ittx.spring002.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ittx.spring002.model.User;
import com.ittx.spring002.server.UserServer;

@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * 控制层注入业务实例，业务实例必须声明为接口
	 */
	@Autowired
	private UserServer userServer;
	
	@RequestMapping("/add_form")
	public String addUserForm(){
		return "user/add_user";
	}
	
	// user/add.do
	@RequestMapping("/add")
	public String addUser(User user, Model model){
		userServer.addUser(user);
		return "redirect:/user/list.do";
	}
	// user/list.do
	@RequestMapping("/list")
	public String findAll(Map<String, Object> map) {
		List<User> userLists = userServer.getUserLists();
		map.put("userLists", userLists);
		return "user/list_user";
	}
	//user/delete.do
	@RequestMapping("/delete")
	public String deleteUser(Integer id){
		User user = userServer.getUserById(id);
		userServer.deleteUser(user);
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/update")
	public String updateUser(String name){
		System.out.println("name  :"+name);
		return "redirect:/user/list.do";
	}
	

}
