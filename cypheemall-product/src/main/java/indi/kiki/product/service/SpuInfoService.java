package indi.kiki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author Cypher
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 21:19:56
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

