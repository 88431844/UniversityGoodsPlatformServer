package server.userInfo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.userInfo.dao.UserInfoMapper;
import server.userInfo.dto.UserInfoDto;
import server.userInfo.entity.UserInfo;
@Service
public class UserInfoServerIm implements UserInfoServer{

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Override
	public void add(UserInfoDto userInfoDto) throws Exception {
		UserInfo userInfo = new UserInfo();
		BeanUtils.copyProperties(userInfo, userInfoDto);
		userInfoMapper.insertSelective(userInfo);
		
	}

	@Override
	public void del(UserInfoDto userInfoDto) throws Exception {
		userInfoMapper.deleteByPrimaryKey(Integer.parseInt(userInfoDto.getId()));
		
	}

	@Override
	public void update(UserInfoDto userInfoDto) throws Exception {
		UserInfo userInfo = new UserInfo();
		BeanUtils.copyProperties(userInfo, userInfoDto);
		userInfoMapper.updateByPrimaryKeySelective(userInfo);
		
	}

	@Override
	public List<UserInfoDto> select(UserInfoDto userInfoDto) throws Exception {
		List<UserInfoDto> list = new ArrayList<UserInfoDto>();
		list = userInfoMapper.select(userInfoDto);
		return list;
		
	}


}
