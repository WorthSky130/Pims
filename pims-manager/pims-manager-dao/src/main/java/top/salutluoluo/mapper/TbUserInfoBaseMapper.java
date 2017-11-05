package top.salutluoluo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.salutluoluo.pojo.TbUserInfoBase;
import top.salutluoluo.pojo.TbUserInfoBaseExample;

public interface TbUserInfoBaseMapper {
    int countByExample(TbUserInfoBaseExample example);

    int deleteByExample(TbUserInfoBaseExample example);

    int deleteByPrimaryKey(String userGlobalId);

    int insert(TbUserInfoBase record);

    int insertSelective(TbUserInfoBase record);

    List<TbUserInfoBase> selectByExample(TbUserInfoBaseExample example);

    TbUserInfoBase selectByPrimaryKey(String userGlobalId);

    int updateByExampleSelective(@Param("record") TbUserInfoBase record, @Param("example") TbUserInfoBaseExample example);

    int updateByExample(@Param("record") TbUserInfoBase record, @Param("example") TbUserInfoBaseExample example);

    int updateByPrimaryKeySelective(TbUserInfoBase record);

    int updateByPrimaryKey(TbUserInfoBase record);
}