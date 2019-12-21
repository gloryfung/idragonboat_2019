package cn.idragonboat.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;

import cn.idragonboat.dao.UserDao;
import cn.idragonboat.vo.UserVO;

public class PageHelperTest {
	
	@Test
	@SuppressWarnings("resource")
	public void testPageHelper() throws Exception {
		//初始spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml"); 
		//从容器获取dao的代理对象
		UserDao userDao = applicationContext.getBean(UserDao.class);
		//设置PageHelper的startPage方法
		PageHelper.startPage(1, 5);
		//执行查询
		List<UserVO> findAllUserInfo = userDao.findAllUserInfo();
//		UserVO userVO = userDao.findUserInfo("1");
		System.out.println(findAllUserInfo.get(0).getName());
		//取分页信息，pageInfo
	}
	
}
