package indi.kiki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import indi.kiki.common.utils.PageUtils;
import indi.kiki.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Cypher
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 21:19:56
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

