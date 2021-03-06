package com.spring.dao1;

import com.spring.model1.YHvfactordaytab0;
import com.spring.model1.YHvfactordaytab0Example;
import com.spring.model1.YHvfactordaytab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactordaytab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YHvfactordaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YHvfactordaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YHvfactordaytab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YHvfactordaytab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YHvfactordaytab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YHvfactordaytab0> selectByExample(YHvfactordaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YHvfactordaytab0 selectByPrimaryKey(YHvfactordaytab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactordaytab0 record, @Param("example") YHvfactordaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YHvfactordaytab0 record, @Param("example") YHvfactordaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactordaytab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YHvfactordaytab0 record);
}