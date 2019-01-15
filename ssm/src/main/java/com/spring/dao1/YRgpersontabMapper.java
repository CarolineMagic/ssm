package com.spring.dao1;

import com.spring.model1.YRgpersontab;
import com.spring.model1.YRgpersontabExample;
import com.spring.model1.YRgpersontabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YRgpersontabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YRgpersontabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YRgpersontabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YRgpersontabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YRgpersontab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YRgpersontab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YRgpersontab> selectByExample(YRgpersontabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YRgpersontab selectByPrimaryKey(YRgpersontabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YRgpersontab record, @Param("example") YRgpersontabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YRgpersontab record, @Param("example") YRgpersontabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YRgpersontab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YRgpersontab record);
}