package com.spring.dao1;

import com.spring.model1.YCindextargetmonthtab0;
import com.spring.model1.YCindextargetmonthtab0Example;
import com.spring.model1.YCindextargetmonthtab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCindextargetmonthtab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YCindextargetmonthtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YCindextargetmonthtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YCindextargetmonthtab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YCindextargetmonthtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YCindextargetmonthtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YCindextargetmonthtab0> selectByExample(YCindextargetmonthtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YCindextargetmonthtab0 selectByPrimaryKey(YCindextargetmonthtab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YCindextargetmonthtab0 record, @Param("example") YCindextargetmonthtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YCindextargetmonthtab0 record, @Param("example") YCindextargetmonthtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YCindextargetmonthtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTARGETMONTHTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YCindextargetmonthtab0 record);
}