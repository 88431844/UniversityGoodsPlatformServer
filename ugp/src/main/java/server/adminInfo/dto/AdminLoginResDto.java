package server.adminInfo.dto;

import server.commonInfo.dto.CommonResDto;

public class AdminLoginResDto extends CommonResDto{

	private AdminInfoDto adto;

	public AdminInfoDto getAdto() {
		return adto;
	}

	public void setAdto(AdminInfoDto adto) {
		this.adto = adto;
	}
	
	
}
