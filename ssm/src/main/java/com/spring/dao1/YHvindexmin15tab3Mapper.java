package com.spring.dao1;

import com.spring.model1.YHvindexmin15tab3;
import com.spring.model1.YHvindexmin15tab3Example;
import com.spring.model1.YHvindexmin15tab3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvindexmin15tab3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YHvindexmin15tab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YHvindexmin15tab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YHvindexmin15tab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YHvindexmin15tab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YHvindexmin15tab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YHvindexmin15tab3> selectByExample(YHvindexmin15tab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YHvindexmin15tab3 selectByPrimaryKey(YHvindexmin15tab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvindexmin15tab3 record, @Param("example") YHvindexmin15tab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YHvindexmin15tab3 record, @Param("example") YHvindexmin15tab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YHvindexmin15tab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMIN15TAB3
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YHvindexmin15tab3 record);
}