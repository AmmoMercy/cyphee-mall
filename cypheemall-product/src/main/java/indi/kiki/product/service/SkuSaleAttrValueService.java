package indi.kiki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Cypher
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 21:19:56
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

