package com.spring.dao1;

import com.spring.model1.YHvindexmonthtab2;
import com.spring.model1.YHvindexmonthtab2Example;
import com.spring.model1.YHvindexmonthtab2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvindexmonthtab2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvindexmonthtab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvindexmonthtab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvindexmonthtab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvindexmonthtab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvindexmonthtab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvindexmonthtab2> selectByExample(YHvindexmonthtab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvindexmonthtab2 selectByPrimaryKey(YHvindexmonthtab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvindexmonthtab2 record, @Param("example") YHvindexmonthtab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvindexmonthtab2 record, @Param("example") YHvindexmonthtab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvindexmonthtab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXMONTHTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvindexmonthtab2 record);
}