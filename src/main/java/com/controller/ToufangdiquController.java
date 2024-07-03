package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ToufangdiquEntity;
import com.entity.view.ToufangdiquView;

import com.service.ToufangdiquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 投放地区
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-19 12:20:14
 */
@RestController
@RequestMapping("/toufangdiqu")
public class ToufangdiquController {
    @Autowired
    private ToufangdiquService toufangdiquService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ToufangdiquEntity toufangdiqu,
		HttpServletRequest request){
        EntityWrapper<ToufangdiquEntity> ew = new EntityWrapper<ToufangdiquEntity>();
		PageUtils page = toufangdiquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toufangdiqu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ToufangdiquEntity toufangdiqu, 
		HttpServletRequest request){
        EntityWrapper<ToufangdiquEntity> ew = new EntityWrapper<ToufangdiquEntity>();
		PageUtils page = toufangdiquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toufangdiqu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ToufangdiquEntity toufangdiqu){
       	EntityWrapper<ToufangdiquEntity> ew = new EntityWrapper<ToufangdiquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( toufangdiqu, "toufangdiqu")); 
        return R.ok().put("data", toufangdiquService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ToufangdiquEntity toufangdiqu){
        EntityWrapper< ToufangdiquEntity> ew = new EntityWrapper< ToufangdiquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( toufangdiqu, "toufangdiqu")); 
		ToufangdiquView toufangdiquView =  toufangdiquService.selectView(ew);
		return R.ok("查询投放地区成功").put("data", toufangdiquView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ToufangdiquEntity toufangdiqu = toufangdiquService.selectById(id);
        return R.ok().put("data", toufangdiqu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ToufangdiquEntity toufangdiqu = toufangdiquService.selectById(id);
        return R.ok().put("data", toufangdiqu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ToufangdiquEntity toufangdiqu, HttpServletRequest request){
    	toufangdiqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toufangdiqu);
        toufangdiquService.insert(toufangdiqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ToufangdiquEntity toufangdiqu, HttpServletRequest request){
    	toufangdiqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toufangdiqu);
        toufangdiquService.insert(toufangdiqu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ToufangdiquEntity toufangdiqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(toufangdiqu);
        toufangdiquService.updateById(toufangdiqu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        toufangdiquService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ToufangdiquEntity> wrapper = new EntityWrapper<ToufangdiquEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = toufangdiquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
