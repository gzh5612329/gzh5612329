package cn.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.bean.User;
import cn.xdl.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/user/toLogin")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("/user/toMain")
	public String toMain(String username,String password,HttpServletRequest request) {
		User user=userService.findUserByUserNameAndPassword(username,password);
		System.out.println("1");
		if(null==user) {
			return "login";
		}
		request.setAttribute("user",user);
		return "main";
	}
}
