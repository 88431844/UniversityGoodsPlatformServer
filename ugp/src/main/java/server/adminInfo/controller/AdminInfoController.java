package server.adminInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import server.adminInfo.dao.AdminInfoMapper;

/**
 * ����Աcontroller
 * @author:miracle
 * Created on 2016��12��19�� ����9:44:47
 * @modify author:�޸���
 * Modify on �޸�ʱ��
 */
@Controller
@RequestMapping(value = "/adminInfo")
public class AdminInfoController {

	@Autowired
	private AdminInfoMapper adminInfoMapper;
}
