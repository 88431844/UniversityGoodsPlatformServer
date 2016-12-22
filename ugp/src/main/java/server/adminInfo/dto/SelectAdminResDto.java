package server.adminInfo.dto;

import java.util.List;

import server.commonInfo.dto.CommonResDto;

public class SelectAdminResDto extends CommonResDto{

	private List<AdminInfoDto> alist;

	public List<AdminInfoDto> getAlist() {
		return alist;
	}

	public void setAlist(List<AdminInfoDto> alist) {
		this.alist = alist;
	}
	
	
}
