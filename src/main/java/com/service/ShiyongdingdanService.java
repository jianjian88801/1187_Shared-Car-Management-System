package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyongdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyongdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyongdingdanView;


/**
 * 使用订单
 *
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface ShiyongdingdanService extends IService<ShiyongdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyongdingdanVO> selectListVO(Wrapper<ShiyongdingdanEntity> wrapper);
   	
   	ShiyongdingdanVO selectVO(@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);
   	
   	List<ShiyongdingdanView> selectListView(Wrapper<ShiyongdingdanEntity> wrapper);
   	
   	ShiyongdingdanView selectView(@Param("ew") Wrapper<ShiyongdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyongdingdanEntity> wrapper);
   	
}

