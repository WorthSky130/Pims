package top.salutluoluo.service;

import top.salutluoluo.pojo.TbUserLogin;

/*
 * 用户登录的服务接口
 */
public interface UserLoginService {
    //用户登录方法
	TbUserLogin getUserLoginbyId(String userGlobalId);
	
}
