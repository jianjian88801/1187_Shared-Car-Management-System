package com.dao;

import com.entity.ShiyongdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyongdingdanVO;
import com.entity.view.ShiyongdingdanView;


/**
 * 使用订单
 * 
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface ShiyongdingdanDao extends BaseMapper<ShiyongdingdanEntity> {
	
	List<ShiyongdingdanVO> selectListVO(@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);
	
	ShiyongdingdanVO selectVO(@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);
	
	List<ShiyongdingdanView> selectListView(@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);

	List<ShiyongdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);
	
	ShiyongdingdanView selectView(@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);
	
}
