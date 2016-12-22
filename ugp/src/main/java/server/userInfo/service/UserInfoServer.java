package server.userInfo.service;

import java.util.List;

import server.userInfo.dto.UserInfoDto;

public interface UserInfoServer {

	public void add(UserInfoDto userInfoDto) throws Exception;
	public void del(UserInfoDto userInfoDto) throws Exception;
	public void update(UserInfoDto userInfoDto) throws Exception;
	public List<UserInfoDto> select(UserInfoDto userInfoDto) throws Exception;
}
