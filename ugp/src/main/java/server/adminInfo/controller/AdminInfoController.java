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
	private AdminInfoService as;
	private static final Logger log = LoggerFactory.getLogger(AdminInfoController.class.getName());
	/**
	 * ����Ա��¼
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016��12��22�� ����2:25:22
	 * @modify author:�޸���
	 * Modify on �޸�ʱ��
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
	 * �޸Ĺ���Ա��Ϣ
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016��12��22�� ����4:06:46
	 * @modify author:�޸���
	 * Modify on �޸�ʱ��
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
	 * ��ӹ���Ա
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016��12��22�� ����4:11:49
	 * @modify author:�޸���
	 * Modify on �޸�ʱ��
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
	 * ɾ������Ա
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016��12��22�� ����4:15:45
	 * @modify author:�޸���
	 * Modify on �޸�ʱ��
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
	 * ��ѯ����Ա
	 * @param req
	 * @return 
	 * @author:miracle
	 * Created on 2016��12��22�� ����4:26:45
	 * @modify author:�޸���
	 * Modify on �޸�ʱ��
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
