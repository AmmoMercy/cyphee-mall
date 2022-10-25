package indi.kiki.ware.dao;

import indi.kiki.ware.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 11:25:41
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
