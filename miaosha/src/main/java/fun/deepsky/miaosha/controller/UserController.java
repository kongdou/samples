package fun.deepsky.miaosha.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fun.deepsky.miaosha.controller.viewobject.UserVO;
import fun.deepsky.miaosha.service.UserService;
import fun.deepsky.miaosha.service.model.UserModel;

@Controller("user")
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/get")
	@ResponseBody
	public UserVO getUser(@RequestParam("id") Integer id) {
		UserModel userModel = userService.getUserById(id);
		return convertFromModel(userModel);
	}
	
	/**
	 * 
	 * @param userModel
	 * @return
	 */
	private UserVO convertFromModel(UserModel userModel) {
		if(userModel == null) {
			return null;
		}
		UserVO userVO = new UserVO();
		
		BeanUtils.copyProperties(userModel, userVO);
		return userVO;
		
	}
	
}
