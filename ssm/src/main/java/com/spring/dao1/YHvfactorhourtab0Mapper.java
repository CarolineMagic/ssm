package com.spring.dao1;

import com.spring.model1.YHvfactorhourtab0;
import com.spring.model1.YHvfactorhourtab0Example;
import com.spring.model1.YHvfactorhourtab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactorhourtab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YHvfactorhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YHvfactorhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YHvfactorhourtab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YHvfactorhourtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YHvfactorhourtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YHvfactorhourtab0> selectByExample(YHvfactorhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YHvfactorhourtab0 selectByPrimaryKey(YHvfactorhourtab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactorhourtab0 record, @Param("example") YHvfactorhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YHvfactorhourtab0 record, @Param("example") YHvfactorhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactorhourtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YHvfactorhourtab0 record);
}