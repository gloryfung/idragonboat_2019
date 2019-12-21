package cn.idragonboat.service.impl;

import java.util.Optional;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.idragonboat.dao.UserDao;
import cn.idragonboat.service.UserService;
import cn.idragonboat.vo.UserVO;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public UserVO findUserInfo(String uid) throws ApplicationException {
		return userDao.findUserInfo(uid);
	}

	@Override
	public Optional<UserVO> getUserOptional(String uid) throws ApplicationException {
		return Optional.ofNullable(userDao.findUserInfo(uid));
	}

}
