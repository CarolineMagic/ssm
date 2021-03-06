package com.spring.dao1;

import com.spring.model1.YHvfactordaytab1;
import com.spring.model1.YHvfactordaytab1Example;
import com.spring.model1.YHvfactordaytab1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactordaytab1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YHvfactordaytab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YHvfactordaytab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YHvfactordaytab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YHvfactordaytab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YHvfactordaytab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YHvfactordaytab1> selectByExample(YHvfactordaytab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YHvfactordaytab1 selectByPrimaryKey(YHvfactordaytab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactordaytab1 record, @Param("example") YHvfactordaytab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YHvfactordaytab1 record, @Param("example") YHvfactordaytab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactordaytab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YHvfactordaytab1 record);
}