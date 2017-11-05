package top.salutluoluo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.salutluoluo.pojo.TbUserLogin;
import top.salutluoluo.pojo.TbUserLoginExample;

public interface TbUserLoginMapper {
    int countByExample(TbUserLoginExample example);

    int deleteByExample(TbUserLoginExample example);

    int deleteByPrimaryKey(String userGlobalId);

    int insert(TbUserLogin record);

    int insertSelective(TbUserLogin record);

    List<TbUserLogin> selectByExample(TbUserLoginExample example);

    TbUserLogin selectByPrimaryKey(String userGlobalId);

    int updateByExampleSelective(@Param("record") TbUserLogin record, @Param("example") TbUserLoginExample example);

    int updateByExample(@Param("record") TbUserLogin record, @Param("example") TbUserLoginExample example);

    int updateByPrimaryKeySelective(TbUserLogin record);

    int updateByPrimaryKey(TbUserLogin record);
}