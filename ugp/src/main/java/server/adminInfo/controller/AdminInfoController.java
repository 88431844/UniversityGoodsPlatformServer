package server.adminInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import server.adminInfo.dao.AdminInfoMapper;

/**
 * 管理员controller
 * @author:miracle
 * Created on 2016年12月19日 上午9:44:47
 * @modify author:修改人
 * Modify on 修改时间
 */
@Controller
@RequestMapping(value = "/adminInfo")
public class AdminInfoController {

	@Autowired
	private AdminInfoMapper adminInfoMapper;
}
