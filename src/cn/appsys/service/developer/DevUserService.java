package cn.appsys.service.developer;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DevUser;

public interface DevUserService {
	/**
	 * 验证用户登录
	 * */
	DevUser login(String devCode,String devPassword) throws Exception;
}
