package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.MemCard;
import cn.itcast.ssm.po.MemCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemCardMapper {
    int countByExample(MemCardExample example);

    int deleteByExample(MemCardExample example);

    int insert(MemCard record);

    int insertSelective(MemCard record);

    List<MemCard> selectByExample(MemCardExample example);

    int updateByExampleSelective(@Param("record") MemCard record, @Param("example") MemCardExample example);

    int updateByExample(@Param("record") MemCard record, @Param("example") MemCardExample example);
}