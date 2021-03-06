package com.spring.dao1;

import com.spring.model1.YHvfactormin15tab2;
import com.spring.model1.YHvfactormin15tab2Example;
import com.spring.model1.YHvfactormin15tab2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactormin15tab2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvfactormin15tab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvfactormin15tab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvfactormin15tab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvfactormin15tab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvfactormin15tab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvfactormin15tab2> selectByExample(YHvfactormin15tab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvfactormin15tab2 selectByPrimaryKey(YHvfactormin15tab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactormin15tab2 record, @Param("example") YHvfactormin15tab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvfactormin15tab2 record, @Param("example") YHvfactormin15tab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactormin15tab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvfactormin15tab2 record);
}