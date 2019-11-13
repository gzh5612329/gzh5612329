package cn.xdl.service;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.User;

public interface UserService {

	public User findUserById(int id);
	
	public User findUserByUserNameAndPassword(@Param("username")String username,@Param("password")String password);
}
