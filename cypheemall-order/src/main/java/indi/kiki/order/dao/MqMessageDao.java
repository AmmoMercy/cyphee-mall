package indi.kiki.order.dao;

import indi.kiki.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Cypher
 * @email hqulichuanjian@gmail.com
 * @date 2022-10-25 11:17:46
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
