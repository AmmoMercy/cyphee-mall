package indi.kiki.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 采购需求
 *
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 11:25:41
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

