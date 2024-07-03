package com.entity.view;

import com.entity.QicherukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
@TableName("qicheruku")
public class QicherukuView  extends QicherukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicherukuView(){
	}
 
 	public QicherukuView(QicherukuEntity qicherukuEntity){
 	try {
			BeanUtils.copyProperties(this, qicherukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
