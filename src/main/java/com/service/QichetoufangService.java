package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichetoufangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichetoufangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichetoufangView;


/**
 * 汽车投放
 *
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface QichetoufangService extends IService<QichetoufangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichetoufangVO> selectListVO(Wrapper<QichetoufangEntity> wrapper);
   	
   	QichetoufangVO selectVO(@Param("ew") Wrapper<QichetoufangEntity> wrapper);
   	
   	List<QichetoufangView> selectListView(Wrapper<QichetoufangEntity> wrapper);
   	
   	QichetoufangView selectView(@Param("ew") Wrapper<QichetoufangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichetoufangEntity> wrapper);
   	
}

