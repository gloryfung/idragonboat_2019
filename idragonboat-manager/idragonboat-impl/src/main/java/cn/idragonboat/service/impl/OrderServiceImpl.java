package cn.idragonboat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.idragonboat.service.AbstractHandler;
import cn.idragonboat.service.IOrderService;
import cn.idragonboat.vo.OrderDTO;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
    	
    	
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }


}