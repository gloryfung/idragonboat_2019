package cn.idragonboat.controller;

import java.util.Optional;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.idragonboat.service.IOrderService;
import cn.idragonboat.vo.OrderDTO;
import cn.idragonboat.vo.UserVO;

@Controller
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@RequestMapping(value="/handle", method=RequestMethod.POST)
	@ResponseBody
	public void handle(OrderDTO dto) throws ApplicationException {
		orderService.handle( dto);
	}
	
	@RequestMapping("/handle/{typeId}")
	@ResponseBody
	public OrderDTO handle(@PathVariable String typeId) throws ApplicationException {
		OrderDTO dto = new OrderDTO();
		dto.setType(typeId);
		String kk =  orderService.handle( dto);
		System.out.println("fzl:" + kk.toString());
		dto.setType(kk);
		return dto;
	}

}
