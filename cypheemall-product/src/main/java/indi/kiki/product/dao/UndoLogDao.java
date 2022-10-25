package indi.kiki.product.dao;

import indi.kiki.product.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Cypher
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 21:19:56
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
