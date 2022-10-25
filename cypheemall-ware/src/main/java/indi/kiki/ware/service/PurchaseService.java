package indi.kiki.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购单
 *
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 11:25:41
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

