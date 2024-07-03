package com.dao;

import com.entity.ToufangdiquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToufangdiquVO;
import com.entity.view.ToufangdiquView;


/**
 * 投放地区
 * 
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface ToufangdiquDao extends BaseMapper<ToufangdiquEntity> {
	
	List<ToufangdiquVO> selectListVO(@Param("ew") Wrapper<ToufangdiquEntity> wrapper);
	
	ToufangdiquVO selectVO(@Param("ew") Wrapper<ToufangdiquEntity> wrapper);
	
	List<ToufangdiquView> selectListView(@Param("ew") Wrapper<ToufangdiquEntity> wrapper);

	List<ToufangdiquView> selectListView(Pagination page,@Param("ew") Wrapper<ToufangdiquEntity> wrapper);
	
	ToufangdiquView selectView(@Param("ew") Wrapper<ToufangdiquEntity> wrapper);
	
}
