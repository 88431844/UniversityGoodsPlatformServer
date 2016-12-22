package server.adminInfo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import server.adminInfo.dto.AddAdminReqDto;
import server.adminInfo.dto.AdminInfoDto;
import server.adminInfo.dto.AdminLoginReqDto;
import server.adminInfo.dto.AdminLoginResDto;
import server.adminInfo.dto.DelAdminReqDto;
import server.adminInfo.dto.SelectAdminReqDto;
import server.adminInfo.dto.SelectAdminResDto;
import server.adminInfo.dto.UpdateAdminReqDto;
import server.adminInfo.service.AdminInfoService;
import server.commonInfo.dto.CommonResDto;
import util.Const;

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
	private AdminInfoService as;
	private static final Logger log = LoggerFactory.getLogger(AdminInfoController.class.getName());
	/**
	 * 管理员登录
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016年12月22日 下午2:25:22
	 * @modify author:修改人
	 * Modify on 修改时间
	 */
	@RequestMapping("/adminLogin")
	@ResponseBody
	public AdminLoginResDto adminLogin(@RequestBody AdminLoginReqDto req){
		AdminLoginResDto res = new AdminLoginResDto();
		AdminInfoDto adto = new AdminInfoDto();
		try {
			adto = as.adminLogin(req);
			if(null != adto.getId()){
				res.setAdto(adto);
				res.setCode(Const.SUCCESS);
			}
		} catch (Exception e) {
			log.error("adminLogin error");
			res.setCode(Const.FAIL);
		}
		
		return res;
	}
	/**
	 * 修改管理员信息
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016年12月22日 下午4:06:46
	 * @modify author:修改人
	 * Modify on 修改时间
	 */
	@RequestMapping("/updateAdmin")
	@ResponseBody
	public CommonResDto updateAdmin(@RequestBody UpdateAdminReqDto req){
		CommonResDto res = new CommonResDto();
		try {
			as.update(req);
			res.setCode(Const.SUCCESS);
		} catch (Exception e) {
			log.error("updateAdmin error");
			res.setCode(Const.FAIL);
		}
		return res;
	}
	/**
	 * 添加管理员
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016年12月22日 下午4:11:49
	 * @modify author:修改人
	 * Modify on 修改时间
	 */
	public CommonResDto addAdmin(@RequestBody AddAdminReqDto req){
		CommonResDto res = new CommonResDto();
		try {
			as.add(req);
			res.setCode(Const.SUCCESS);
		} catch (Exception e) {
			log.error("addAdmin error");
			res.setCode(Const.FAIL);
		}
		return res;
	}
	/**
	 * 删除管理员
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016年12月22日 下午4:15:45
	 * @modify author:修改人
	 * Modify on 修改时间
	 */
	public CommonResDto delAdmin(@RequestBody DelAdminReqDto req){
		CommonResDto res = new CommonResDto();
		try {
			as.del(req);
			res.setCode(Const.SUCCESS);
		} catch (Exception e) {
			log.error("delAdmin error");
			res.setCode(Const.FAIL);
		}
		return res;
	}
	/**
	 * 查询管理员
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016年12月22日 下午4:26:45
	 * @modify author:修改人
	 * Modify on 修改时间
	 */
	public SelectAdminResDto selectAdmin(@RequestBody SelectAdminReqDto req){
		SelectAdminResDto res = new SelectAdminResDto();
		List<AdminInfoDto> alist = null;
		try {
			alist = as.select(req);
			res.setAlist(alist);
			res.setCode(Const.SUCCESS);
		} catch (Exception e) {
			log.error("selectAdmin error");
			res.setCode(Const.FAIL);
		}
		return res;
	}
}
