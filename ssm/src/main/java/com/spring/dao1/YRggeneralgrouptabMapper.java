package com.spring.dao1;

import com.spring.model1.YRggeneralgrouptab;
import com.spring.model1.YRggeneralgrouptabExample;
import com.spring.model1.YRggeneralgrouptabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YRggeneralgrouptabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YRggeneralgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YRggeneralgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YRggeneralgrouptabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YRggeneralgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YRggeneralgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YRggeneralgrouptab> selectByExample(YRggeneralgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YRggeneralgrouptab selectByPrimaryKey(YRggeneralgrouptabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YRggeneralgrouptab record, @Param("example") YRggeneralgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YRggeneralgrouptab record, @Param("example") YRggeneralgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YRggeneralgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YRggeneralgrouptab record);
}