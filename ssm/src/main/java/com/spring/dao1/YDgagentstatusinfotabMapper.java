package com.spring.dao1;

import com.spring.model1.YDgagentstatusinfotab;
import com.spring.model1.YDgagentstatusinfotabExample;
import com.spring.model1.YDgagentstatusinfotabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YDgagentstatusinfotabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YDgagentstatusinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YDgagentstatusinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YDgagentstatusinfotabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YDgagentstatusinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YDgagentstatusinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YDgagentstatusinfotab> selectByExample(YDgagentstatusinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YDgagentstatusinfotab selectByPrimaryKey(YDgagentstatusinfotabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YDgagentstatusinfotab record, @Param("example") YDgagentstatusinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YDgagentstatusinfotab record, @Param("example") YDgagentstatusinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YDgagentstatusinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_DGAGENTSTATUSINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YDgagentstatusinfotab record);
}