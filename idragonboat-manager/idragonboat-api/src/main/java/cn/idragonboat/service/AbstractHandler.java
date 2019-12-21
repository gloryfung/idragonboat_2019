package cn.idragonboat.service;

import org.springframework.stereotype.Service;

import cn.idragonboat.vo.OrderDTO;

@Service
public abstract class AbstractHandler {
	
	abstract public String handle(OrderDTO dto);
	
}
