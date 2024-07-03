package com.entity.view;

import com.entity.QichetoufangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车投放
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
@TableName("qichetoufang")
public class QichetoufangView  extends QichetoufangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QichetoufangView(){
	}
 
 	public QichetoufangView(QichetoufangEntity qichetoufangEntity){
 	try {
			BeanUtils.copyProperties(this, qichetoufangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
