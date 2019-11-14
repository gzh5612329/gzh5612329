package cn.xdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.User;
import cn.xdl.dao.UserDao;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;
	
	public List<User> getUser() {
		
		return userdao.findUser();
	}

}
