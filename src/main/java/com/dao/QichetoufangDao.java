package com.dao;

import com.entity.QichetoufangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichetoufangVO;
import com.entity.view.QichetoufangView;


/**
 * 汽车投放
 * 
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
public interface QichetoufangDao extends BaseMapper<QichetoufangEntity> {
	
	List<QichetoufangVO> selectListVO(@Param("ew") Wrapper<QichetoufangEntity> wrapper);
	
	QichetoufangVO selectVO(@Param("ew") Wrapper<QichetoufangEntity> wrapper);
	
	List<QichetoufangView> selectListView(@Param("ew") Wrapper<QichetoufangEntity> wrapper);

	List<QichetoufangView> selectListView(Pagination page,@Param("ew") Wrapper<QichetoufangEntity> wrapper);
	
	QichetoufangView selectView(@Param("ew") Wrapper<QichetoufangEntity> wrapper);
	
}
