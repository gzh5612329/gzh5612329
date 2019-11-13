package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.User;
import cn.xdl.dao.UserDao;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User findUserById(int id) {
		
		return userDao.findUserById(id);
	}
	public User findUserByUserNameAndPassword(String username, String password) {
		
		return userDao.findUserByUserNameAndPassword(username, password);
	}

}
