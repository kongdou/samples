package fun.deepsky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import fun.deepsky.mapper.OrderMapper;
import fun.deepsky.po.Order;

@Service
public class OrderService {

	@Autowired
	OrderMapper orderMapper;
	
	public List<Order> getOrderByUserId(int userId){
        return orderMapper.getOrderByUserId(userId);
    }
	
	public void save(Order order){
		orderMapper.save(order);
    }
	
	public List<Order> getAll(int pageNum,int pageSize)throws Exception{
		PageHelper.startPage(pageNum,pageSize);
		return orderMapper.getAll();
	}
	
	public void deleteAll() {
		orderMapper.deleteAll();
	}
	
}
