package com.yeasheng.yeashengmall.mapper;

import com.yeasheng.yeashengmall.model.HibernateSequence;
import com.yeasheng.yeashengmall.model.HibernateSequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HibernateSequenceMapper {
    long countByExample(HibernateSequenceExample example);

    int deleteByExample(HibernateSequenceExample example);

    int insert(HibernateSequence record);

    int insertSelective(HibernateSequence record);

    List<HibernateSequence> selectByExample(HibernateSequenceExample example);

    int updateByExampleSelective(@Param("record") HibernateSequence record, @Param("example") HibernateSequenceExample example);

    int updateByExample(@Param("record") HibernateSequence record, @Param("example") HibernateSequenceExample example);
}