package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicherukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicherukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicherukuView;


/**
 * 汽车入库
 *
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface QicherukuService extends IService<QicherukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicherukuVO> selectListVO(Wrapper<QicherukuEntity> wrapper);
   	
   	QicherukuVO selectVO(@Param("ew") Wrapper<QicherukuEntity> wrapper);
   	
   	List<QicherukuView> selectListView(Wrapper<QicherukuEntity> wrapper);
   	
   	QicherukuView selectView(@Param("ew") Wrapper<QicherukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicherukuEntity> wrapper);
   	
}

