package server.userInfo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import server.userInfo.service.UserInfoServer;
/**
 * 用户controller
 * @author:miracle
 * Created on 2016年12月13日 上午10:55:35
 * @modify author:修改人
 * Modify on 修改时间
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoServer userInfoServer;
	 
}
