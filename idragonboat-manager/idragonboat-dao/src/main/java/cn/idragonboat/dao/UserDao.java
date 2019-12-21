package cn.idragonboat.dao;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

import cn.idragonboat.vo.UserVO;

public interface UserDao {
	
	UserVO findUserInfo(String uid) throws ApplicationException;
	
	List<UserVO> findAllUserInfo() throws ApplicationException;
	
	
}
