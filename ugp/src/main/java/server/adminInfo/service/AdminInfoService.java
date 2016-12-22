package server.adminInfo.service;

import java.util.List;

import server.adminInfo.dto.AddAdminReqDto;
import server.adminInfo.dto.AdminInfoDto;
import server.adminInfo.dto.AdminLoginReqDto;
import server.adminInfo.dto.DelAdminReqDto;
import server.adminInfo.dto.SelectAdminReqDto;
import server.adminInfo.dto.UpdateAdminReqDto;

public interface AdminInfoService {

	public void add(AddAdminReqDto req) throws Exception;
	public void del(DelAdminReqDto req) throws Exception;
	public void update(UpdateAdminReqDto req) throws Exception;
	public List<AdminInfoDto> select(SelectAdminReqDto req) throws Exception;
	public AdminInfoDto adminLogin(AdminLoginReqDto req) throws Exception;
}
