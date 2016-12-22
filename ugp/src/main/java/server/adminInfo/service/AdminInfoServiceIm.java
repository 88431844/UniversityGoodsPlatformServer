package server.adminInfo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import server.adminInfo.dao.AdminInfoMapper;
import server.adminInfo.dto.AdminInfoDto;
import server.adminInfo.entity.AdminInfo;
@Service
public class AdminInfoServiceIm implements AdminInfoService{

	private AdminInfoMapper adminInfoMapper;
	@Override
	public void add(AdminInfoDto adto) throws Exception {
		AdminInfo adminInfo = new AdminInfo();
		BeanUtils.copyProperties(adminInfo, adto);
		adminInfoMapper.insertSelective(adminInfo);
		
	}

	@Override
	public void del(AdminInfoDto adto) throws Exception {
		adminInfoMapper.deleteByPrimaryKey(Integer.parseInt(adto.getId()));
		
	}

	@Override
	public void update(AdminInfoDto adto) throws Exception {
		AdminInfo adminInfo = new AdminInfo();
		BeanUtils.copyProperties(adminInfo, adto);
		adminInfoMapper.updateByPrimaryKeySelective(adminInfo);
		
	}

	@Override
	public List<AdminInfoDto> select(AdminInfoDto adto) throws Exception {
		List<AdminInfoDto> aList = new ArrayList<AdminInfoDto>();
		aList = adminInfoMapper.select(adto);
		return aList;
	}

}
