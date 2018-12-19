package  fun.deepsky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fun.deepsky.po.Order;
import fun.deepsky.service.OrderService;

@RestController
@RequestMapping("/order")
public class UserController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/getOrdersByUserId",method=RequestMethod.GET)
	public List<Order> getByGradeName(@RequestParam("userId") int userId){
		return orderService.getOrderByUserId(userId);
	}
	
	@RequestMapping(value="/addorder",method=RequestMethod.POST)
	public String add(@RequestParam("userId") int userId,@RequestParam("orderId") int orderId,@RequestParam("status") String status) {
		Order order = new Order();
		order.setUserId(userId);
		order.setOrderId(orderId);
		order.setStatus(status);
		orderService.save(order);
		return "success";
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Order> getAll(@RequestParam("num") int pageNum,@RequestParam("size") int pageSize) {
		try {
			return orderService.getAll(pageNum, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="/delAll",method=RequestMethod.DELETE)
	public String delete() {
		try {
			orderService.deleteAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
