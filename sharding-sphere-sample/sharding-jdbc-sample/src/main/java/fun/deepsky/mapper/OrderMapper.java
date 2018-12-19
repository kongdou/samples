package fun.deepsky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import fun.deepsky.po.Order;


@Mapper
public interface OrderMapper {

	@Select("select * from t_order where user_id=#{userId}")
	@Results({@Result(property="userId",column="user_id"),
			  @Result(property="orderId",column="order_id")})
	public List<Order> getOrderByUserId(int userId);
	
	@Insert("insert into t_order(user_id,order_id,status) values(#{userId},#{orderId},#{status})")
	public void save(Order order);
	
	@Select("select * from t_order")
	@Results({@Result(property="userId",column="user_id"),
		  @Result(property="orderId",column="order_id")})
	public List<Order> getAll();
	
	@Delete("delete from t_order")
	public void deleteAll();
}
