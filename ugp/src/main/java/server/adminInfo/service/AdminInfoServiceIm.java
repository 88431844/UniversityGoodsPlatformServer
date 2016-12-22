package server.adminInfo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import server.adminInfo.dao.AdminInfoMapper;
import server.adminInfo.dto.AddAdminReqDto;
import server.adminInfo.dto.AdminInfoDto;
import server.adminInfo.dto.AdminLoginReqDto;
import server.adminInfo.dto.DelAdminReqDto;
import server.adminInfo.dto.SelectAdminReqDto;
import server.adminInfo.dto.UpdateAdminReqDto;
import server.adminInfo.entity.AdminInfo;
@Service
public class AdminInfoServiceIm implements AdminInfoService{

	private AdminInfoMapper adminInfoMapper;
	@Override
	public void add(AddAdminReqDto req) throws Exception {
		AdminInfo adminInfo = new AdminInfo();
		BeanUtils.copyProperties(adminInfo, req);
		adminInfoMapper.insertSelective(adminInfo);
		
	}

	@Override
	public void del(DelAdminReqDto req) throws Exception {
		adminInfoMapper.deleteByPrimaryKey(Integer.parseInt(req.getId()));
		
	}

	@Override
	public void update(UpdateAdminReqDto req) throws Exception {
		AdminInfo adminInfo = new AdminInfo();
		BeanUtils.copyProperties(adminInfo, req);
		adminInfoMapper.updateByPrimaryKeySelective(adminInfo);
		
	}

	@Override
	public List<AdminInfoDto> select(SelectAdminReqDto req) throws Exception {
		List<AdminInfoDto> aList = new ArrayList<AdminInfoDto>();
		AdminInfoDto adto = new AdminInfoDto();
		BeanUtils.copyProperties(adto, req);
		aList = adminInfoMapper.select(adto);
		return aList;
	}

	@Override
	public AdminInfoDto adminLogin(AdminLoginReqDto req) throws Exception {
		AdminInfoDto adto = null;
		List<AdminInfoDto> alist = new ArrayList<AdminInfoDto>();
		BeanUtils.copyProperties(adto, req);
		alist = adminInfoMapper.select(adto);
		if(null != alist && 1 == alist.size()){
			adto = alist.get(0);
		}
		return adto;
	}

}
