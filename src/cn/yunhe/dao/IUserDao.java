package cn.yunhe.dao;

import java.util.List;

import cn.yunhe.entity.User;

public interface IUserDao {
	/**
	 * 	添加用户
	 * @param user
	 * @return
	 */
	int addUser(User user);
	/**
	 * 	根据用户ID修改信息
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	/**
	 * 	根据用户ID删除用户
	 * @param uid
	 * @return
	 */
	int delUser(int uid);
	/**
	 *	 根据用户ID查询用户信息
	 * @param uid
	 * @return
	 */
	User queryUser(int uid);
	/**
	 * 根据用户名模糊查询
	 * @param uname
	 * @return
	 */
	List<User> queryUsers(String uname);
	/**
	 *	 查询用户信息
	 * @return
	 */
	List<User> queryUserList();
}













