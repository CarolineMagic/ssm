package com.spring.dao1;

import com.spring.model1.YHvfactorweektab0;
import com.spring.model1.YHvfactorweektab0Example;
import com.spring.model1.YHvfactorweektab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactorweektab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YHvfactorweektab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YHvfactorweektab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YHvfactorweektab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YHvfactorweektab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YHvfactorweektab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YHvfactorweektab0> selectByExample(YHvfactorweektab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YHvfactorweektab0 selectByPrimaryKey(YHvfactorweektab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactorweektab0 record, @Param("example") YHvfactorweektab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YHvfactorweektab0 record, @Param("example") YHvfactorweektab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactorweektab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORWEEKTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YHvfactorweektab0 record);
}