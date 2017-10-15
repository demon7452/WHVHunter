package com.lixiong.admin.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 * Created by lixiong on 2017/10/13.
 */
@Mapper
public interface UserMapper {

    User findByUserId(@Param("userId") int userId);
}
