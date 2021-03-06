package com.spring.dao1;

import com.spring.model1.YCindexthresholdseasontab0;
import com.spring.model1.YCindexthresholdseasontab0Example;
import com.spring.model1.YCindexthresholdseasontab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCindexthresholdseasontab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YCindexthresholdseasontab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YCindexthresholdseasontab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YCindexthresholdseasontab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YCindexthresholdseasontab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YCindexthresholdseasontab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YCindexthresholdseasontab0> selectByExample(YCindexthresholdseasontab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YCindexthresholdseasontab0 selectByPrimaryKey(YCindexthresholdseasontab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YCindexthresholdseasontab0 record, @Param("example") YCindexthresholdseasontab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YCindexthresholdseasontab0 record, @Param("example") YCindexthresholdseasontab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YCindexthresholdseasontab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDSEASONTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YCindexthresholdseasontab0 record);
}