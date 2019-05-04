package com.lyz.makeupMall.mapper;

import java.util.List;
import com.lyz.makeupMall.domain.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
	List<User> selectUserByUserPhone(User user);
	int insertUser(User user);
	int updateUser(User user);
	User selectUserByUserPhone(String userPhone);
}