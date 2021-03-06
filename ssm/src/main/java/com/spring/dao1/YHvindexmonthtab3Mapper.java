package com.spring.dao1;

import com.spring.model1.YHvindexmonthtab3;
import com.spring.model1.YHvindexmonthtab3Example;
import com.spring.model1.YHvindexmonthtab3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvindexmonthtab3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvindexmonthtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvindexmonthtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvindexmonthtab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvindexmonthtab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvindexmonthtab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvindexmonthtab3> selectByExample(YHvindexmonthtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvindexmonthtab3 selectByPrimaryKey(YHvindexmonthtab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvindexmonthtab3 record, @Param("example") YHvindexmonthtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvindexmonthtab3 record, @Param("example") YHvindexmonthtab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvindexmonthtab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvindexmonthtab3 record);
}