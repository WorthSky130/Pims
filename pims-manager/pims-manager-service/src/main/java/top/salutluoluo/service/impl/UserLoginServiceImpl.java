package top.salutluoluo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.salutluoluo.mapper.TbUserLoginMapper;
import top.salutluoluo.pojo.TbUserLogin;
import top.salutluoluo.service.UserLoginService;
/**
 * 用户登录的实现
 * 
 * @author worthsky
 *
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private TbUserLoginMapper userLoginMapper;
	
	@Override
	public TbUserLogin getUserLoginbyId(String userGlobalId) {
		TbUserLogin userLogin = userLoginMapper.selectByPrimaryKey(userGlobalId);
		return userLogin;
	}

}
