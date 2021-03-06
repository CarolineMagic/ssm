package com.spring.dao1;

import com.spring.model1.YMindexrelatedtab;
import com.spring.model1.YMindexrelatedtabExample;
import com.spring.model1.YMindexrelatedtabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMindexrelatedtabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YMindexrelatedtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YMindexrelatedtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YMindexrelatedtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YMindexrelatedtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YMindexrelatedtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YMindexrelatedtab> selectByExample(YMindexrelatedtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YMindexrelatedtab selectByPrimaryKey(YMindexrelatedtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YMindexrelatedtab record, @Param("example") YMindexrelatedtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YMindexrelatedtab record, @Param("example") YMindexrelatedtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YMindexrelatedtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXRELATEDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YMindexrelatedtab record);
}