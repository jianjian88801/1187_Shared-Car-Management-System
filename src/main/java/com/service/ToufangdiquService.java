package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToufangdiquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToufangdiquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToufangdiquView;


/**
 * 投放地区
 *
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface ToufangdiquService extends IService<ToufangdiquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToufangdiquVO> selectListVO(Wrapper<ToufangdiquEntity> wrapper);
   	
   	ToufangdiquVO selectVO(@Param("ew") Wrapper<ToufangdiquEntity> wrapper);
   	
   	List<ToufangdiquView> selectListView(Wrapper<ToufangdiquEntity> wrapper);
   	
   	ToufangdiquView selectView(@Param("ew") Wrapper<ToufangdiquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToufangdiquEntity> wrapper);
   	
}

