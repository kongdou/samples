package fun.deepsky.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fun.deepsky.miaosha.dao.UserDOMapper;
import fun.deepsky.miaosha.dataobject.UserDO;

@SpringBootApplication(scanBasePackages= {"fun.deepsky.miaosha"})
@RestController
@MapperScan("fun.deepsky.miaosha.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private UserDOMapper userDOMapper;
	
	@RequestMapping("/")
	public String home() {
		UserDO userDO = userDOMapper.selectByPrimaryKey(1);
		if(userDO == null) {
			return "用户不存在";
		}else {
			return userDO.getName();
		}
	}
}
