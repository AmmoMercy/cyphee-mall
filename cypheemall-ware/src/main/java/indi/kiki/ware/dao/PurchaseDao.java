package indi.kiki.ware.dao;

import indi.kiki.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购单
 * 
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 11:25:41
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
