package cn.idragonboat.service.impl;

import org.springframework.stereotype.Component;

import com.iglory.anno.HandlerType;

import cn.idragonboat.service.AbstractHandler;
import cn.idragonboat.vo.OrderDTO;

@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler{

	@Override
	public String handle(OrderDTO dto) {
		return "处理普通订单";
	}

}
