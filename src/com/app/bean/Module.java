package com.app.bean;

import java.util.List;

public class Module {
	private int mid;
	private String code;
	private List<String> info;
	public Module(int mid, String code, List<String> info) {
		super();
		this.mid = mid;
		this.code = code;
		this.info = info;
	}
	@Override
	public String toString() {
		return "Module [mid=" + mid + ", code=" + code + ", info=" + info + "]";
	}
	
}
