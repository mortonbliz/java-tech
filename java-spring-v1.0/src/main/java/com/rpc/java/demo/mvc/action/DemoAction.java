package com.rpc.java.demo.mvc.action;

import com.rpc.java.demo.service.IDemoService;
import com.rpc.java.mvcframework.annotation.RAutowired;
import com.rpc.java.mvcframework.annotation.RController;
import com.rpc.java.mvcframework.annotation.RRequestMapping;
import com.rpc.java.mvcframework.annotation.RRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//虽然，用法一样，但是没有功能
@RController
@RRequestMapping("/demo")
public class DemoAction {

  	@RAutowired
	private IDemoService demoService;

	@RRequestMapping("/query")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @RRequestParam("name") String name){
		String result = demoService.get(name);
//		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@RRequestParam("a") Integer a, @RRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RRequestMapping("/sub")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@RRequestParam("a") Double a, @RRequestParam("b") Double b){
		try {
			resp.getWriter().write(a + "-" + b + "=" + (a - b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RRequestMapping("/remove")
	public String  remove(@RRequestParam("id") Integer id){
		return "" + id;
	}

}
