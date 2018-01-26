package cn.appsys.dao.AppInfo;

import java.util.List;

import cn.appsys.pojo.AppInfo;

public interface AppInfoMapper {
	/**
	 * App列表
	 * */
	List<AppInfo> getAppInfoList();
}
