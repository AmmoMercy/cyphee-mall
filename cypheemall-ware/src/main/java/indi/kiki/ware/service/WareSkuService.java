package indi.kiki.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 11:25:41
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

