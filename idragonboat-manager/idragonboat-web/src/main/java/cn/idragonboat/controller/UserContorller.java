package cn.idragonboat.controller;

import java.util.Optional;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.idragonboat.service.UserService;
import cn.idragonboat.vo.UserVO;


@Controller
public class UserContorller {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/findUserInfo/{uid}")
	@ResponseBody
	public UserVO findUserInfo(@PathVariable String uid) throws ApplicationException {
		return userService.findUserInfo(uid);
	}
	
	@RequestMapping("/getUserOptional/{uid}")
	@ResponseBody
	public Optional<UserVO> getUserOptional(@PathVariable String uid) throws ApplicationException {
		return userService.getUserOptional(uid);
	}
	
//	@RequestMapping("/different")
//	@ResponseBody
//	public Object type() throws ApplicationException {
//		return userService.type();
//	}
	
}
