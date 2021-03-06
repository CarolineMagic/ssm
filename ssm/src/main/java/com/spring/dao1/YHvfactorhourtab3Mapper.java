package com.spring.dao1;

import com.spring.model1.YHvfactorhourtab3;
import com.spring.model1.YHvfactorhourtab3Example;
import com.spring.model1.YHvfactorhourtab3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactorhourtab3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    long countByExample(YHvfactorhourtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByExample(YHvfactorhourtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByPrimaryKey(YHvfactorhourtab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insert(YHvfactorhourtab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insertSelective(YHvfactorhourtab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    List<YHvfactorhourtab3> selectByExample(YHvfactorhourtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    YHvfactorhourtab3 selectByPrimaryKey(YHvfactorhourtab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactorhourtab3 record, @Param("example") YHvfactorhourtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExample(@Param("record") YHvfactorhourtab3 record, @Param("example") YHvfactorhourtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactorhourtab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKey(YHvfactorhourtab3 record);
}