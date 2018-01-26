package cn.appsys.service.developer;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.DevUser.DevUserMapper;
import cn.appsys.pojo.DevUser;

@Service
public class DevUserServiceImpl implements DevUserService{
	@Resource
	private DevUserMapper devUserMapper;
	
	public DevUser login(String devCode,String devPassword) throws Exception{
		DevUser user=null;
		user=devUserMapper.getLoginUser(devCode);
		if(null!=user){//登陆成功
			if(!devPassword.equals(user.getDevPassword())){
				user=null;
			}
		}
		return user;
	}
}
