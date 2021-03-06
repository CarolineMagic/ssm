package com.spring.dao1;

import com.spring.model1.YRgplace2dntab;
import com.spring.model1.YRgplace2dntabExample;
import com.spring.model1.YRgplace2dntabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YRgplace2dntabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YRgplace2dntabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YRgplace2dntabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YRgplace2dntabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YRgplace2dntab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YRgplace2dntab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YRgplace2dntab> selectByExample(YRgplace2dntabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YRgplace2dntab selectByPrimaryKey(YRgplace2dntabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YRgplace2dntab record, @Param("example") YRgplace2dntabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YRgplace2dntab record, @Param("example") YRgplace2dntabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YRgplace2dntab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPLACE2DNTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YRgplace2dntab record);
}