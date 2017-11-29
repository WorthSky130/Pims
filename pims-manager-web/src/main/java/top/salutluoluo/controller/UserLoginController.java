package top.salutluoluo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * 用户登录的controller
 * @author lenovo
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.salutluoluo.pojo.TbUserLogin;
import top.salutluoluo.service.UserLoginService;

@Controller
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;
   
	@RequestMapping("/login/{userGlobalId}")
	@ResponseBody
	public TbUserLogin getUserLoginById(@PathVariable String userGlobalId){
		TbUserLogin userLogin =  userLoginService.getUserLoginbyId(userGlobalId); 
		return userLogin;
		
		
	
	}
}
