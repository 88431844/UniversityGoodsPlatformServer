package server.userInfo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import server.userInfo.service.UserInfoServer;
/**
 * �û�controller
 * @author:miracle
 * Created on 2016��12��13�� ����10:55:35
 * @modify author:�޸���
 * Modify on �޸�ʱ��
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoServer userInfoServer;
	 
}
