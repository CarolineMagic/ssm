package com.spring.dao1;

import com.spring.model1.YCfacetgrouptab;
import com.spring.model1.YCfacetgrouptabExample;
import com.spring.model1.YCfacetgrouptabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCfacetgrouptabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YCfacetgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YCfacetgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YCfacetgrouptabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YCfacetgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YCfacetgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YCfacetgrouptab> selectByExample(YCfacetgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YCfacetgrouptab selectByPrimaryKey(YCfacetgrouptabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YCfacetgrouptab record, @Param("example") YCfacetgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YCfacetgrouptab record, @Param("example") YCfacetgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YCfacetgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YCfacetgrouptab record);
}