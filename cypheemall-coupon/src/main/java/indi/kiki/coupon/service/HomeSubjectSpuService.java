package indi.kiki.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 10:19:32
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

