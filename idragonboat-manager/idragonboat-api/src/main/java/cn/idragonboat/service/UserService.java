package cn.idragonboat.service;

import java.util.Optional;

import javax.annotation.Resource;

import org.omg.CORBA.portable.ApplicationException;

import cn.idragonboat.vo.UserVO;

public interface UserService {
	
	UserVO findUserInfo(String uid) throws ApplicationException;
	
	Optional<UserVO> getUserOptional(String uid) throws ApplicationException;
	
}
