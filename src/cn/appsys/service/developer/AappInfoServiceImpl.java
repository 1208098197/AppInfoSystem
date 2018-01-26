package cn.appsys.service.developer;

import java.util.List;

import javax.annotation.Resource;

import cn.appsys.dao.AppInfo.AppInfoMapper;
import cn.appsys.pojo.AppInfo;

public class AappInfoServiceImpl implements AappInfoService{
	
	@Resource
	private AppInfoMapper appInfoMapper;
	/**
	 * 根据条件查询出app列表
	 * @param querySoftwareName
	 * @param queryStatus
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @param devId
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<AppInfo> getAppInfoList(String querySoftwareName,Integer queryStatus,
								Integer queryCategoryLevel1,Integer queryCategoryLevel2,
								Integer queryCategoryLevel3,Integer queryFlatformId,
								Integer devId,Integer currentPageNo,Integer pageSize)throws Exception{
		
		return null;
		
	};
	
}