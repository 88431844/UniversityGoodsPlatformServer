package server.adminInfo.service;

import java.util.List;

import server.adminInfo.dto.AdminInfoDto;

public interface AdminInfoService {

	public void add(AdminInfoDto adto) throws Exception;
	public void del(AdminInfoDto adto) throws Exception;
	public void update(AdminInfoDto adto) throws Exception;
	public List<AdminInfoDto> select(AdminInfoDto adto) throws Exception;
}
