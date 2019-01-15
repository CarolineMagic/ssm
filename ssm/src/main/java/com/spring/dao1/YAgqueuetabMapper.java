package com.spring.dao1;

import com.spring.model1.YAgqueuetab;
import com.spring.model1.YAgqueuetabExample;
import com.spring.model1.YAgqueuetabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAgqueuetabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YAgqueuetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YAgqueuetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YAgqueuetabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YAgqueuetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YAgqueuetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YAgqueuetab> selectByExample(YAgqueuetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YAgqueuetab selectByPrimaryKey(YAgqueuetabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YAgqueuetab record, @Param("example") YAgqueuetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YAgqueuetab record, @Param("example") YAgqueuetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YAgqueuetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGQUEUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YAgqueuetab record);
}