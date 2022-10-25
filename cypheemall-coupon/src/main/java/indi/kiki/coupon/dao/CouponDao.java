package indi.kiki.coupon.dao;

import indi.kiki.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 10:19:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
