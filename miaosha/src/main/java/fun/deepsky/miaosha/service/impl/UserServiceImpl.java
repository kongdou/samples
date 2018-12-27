package fun.deepsky.miaosha.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fun.deepsky.miaosha.dao.UserDOMapper;
import fun.deepsky.miaosha.dao.UserPasswordDOMapper;
import fun.deepsky.miaosha.dataobject.UserDO;
import fun.deepsky.miaosha.dataobject.UserPasswordDO;
import fun.deepsky.miaosha.service.UserService;
import fun.deepsky.miaosha.service.model.UserModel;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDOMapper userDOMapper;


	@Autowired
	private UserPasswordDOMapper userPasswordDOMapper;
	
	
	@Override
	public UserModel getUserById(Integer id) {
		// TODO Auto-generated method stub
		
		UserDO userDo = userDOMapper.selectByPrimaryKey(id);
	
		if(userDo == null) {
			return null;
		}
		
		UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDo.getId());
		
		UserModel userModel = convertFromDataObject(userDo,userPasswordDO);
		
		return userModel;
	
	}
	
	private UserModel convertFromDataObject(UserDO userDo,UserPasswordDO userPasswordDo) {
		
		if(userDo == null) {
			return null;
		}
		
		UserModel userModel = new UserModel();
		BeanUtils.copyProperties(userDo, userModel);
		
		if(userPasswordDo != null) {
			userModel.setEncrptPassword(userPasswordDo.getEncrptPassword()); 
		}
		return userModel;
	}

}
