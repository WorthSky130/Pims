package top.salutluoluo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页的跳转
 * @author lenovo
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
}
