package server.kindInfo.dao;

import server.kindInfo.entity.KindInfo;

public interface KindInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KindInfo record);

    int insertSelective(KindInfo record);

    KindInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KindInfo record);

    int updateByPrimaryKey(KindInfo record);
}