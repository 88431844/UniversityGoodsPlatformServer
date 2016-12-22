package server.adminInfo.dao;

import java.util.List;

import server.adminInfo.dto.AdminInfoDto;
import server.adminInfo.entity.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
    
    List<AdminInfoDto> select(AdminInfoDto adto);
}