package cn.xdl.controller;

import java.util.List;

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
	
	@RequestMapping("/user/list")
	public ModelAndView toUserList() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		List<User> list=userService.getUser();
		mav.getModel().put("data",list);
		return mav;
	}
}
