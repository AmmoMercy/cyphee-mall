package indi.kiki.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 10:19:32
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

