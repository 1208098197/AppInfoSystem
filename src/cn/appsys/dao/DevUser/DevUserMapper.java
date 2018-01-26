package cn.appsys.dao.DevUser;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DevUser;
/**
 * 开发者用户映射接口
 * 
 * */
public interface DevUserMapper {
	/**
	 * 根据用户编码获取用户信息
	 * 
	 * */
	DevUser getLoginUser(@Param("devCode")String devCode)throws Exception;
}
