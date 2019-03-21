package com.itshidu.web.vo;

import java.util.HashMap;
import java.util.List;

public class EasyuiResult extends HashMap<String, Object> {
	public static EasyuiResult build(long total,List rows) {
		EasyuiResult er = new EasyuiResult();
		er.put("total", total);
		er.put("rows", rows);
		return er;
	}
}
