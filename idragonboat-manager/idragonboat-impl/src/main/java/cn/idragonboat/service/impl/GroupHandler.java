package cn.idragonboat.service.impl;

import org.springframework.stereotype.Component;

import com.iglory.anno.HandlerType;

import cn.idragonboat.service.AbstractHandler;
import cn.idragonboat.vo.OrderDTO;

@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler{

	@Override
    public String handle(OrderDTO dto) {
		System.out.println("处理团购订单");
        return "处理团购订单";
    }

}
