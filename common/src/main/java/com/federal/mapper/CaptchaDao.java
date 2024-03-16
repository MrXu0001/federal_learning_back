package com.federal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.federal.model.CaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface CaptchaDao extends BaseMapper<CaptchaEntity> {

}