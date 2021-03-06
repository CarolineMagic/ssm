package com.spring.dao1;

import com.spring.model1.YChfacetvaluetab;
import com.spring.model1.YChfacetvaluetabExample;
import com.spring.model1.YChfacetvaluetabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YChfacetvaluetabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YChfacetvaluetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YChfacetvaluetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YChfacetvaluetabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YChfacetvaluetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YChfacetvaluetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YChfacetvaluetab> selectByExample(YChfacetvaluetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YChfacetvaluetab selectByPrimaryKey(YChfacetvaluetabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YChfacetvaluetab record, @Param("example") YChfacetvaluetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YChfacetvaluetab record, @Param("example") YChfacetvaluetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YChfacetvaluetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YChfacetvaluetab record);
}