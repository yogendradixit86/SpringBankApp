package com.app.bean;

public class Project {
	private int pid;
	private String pcode;
	private Module mob;
	public Project(int pid, String pcode, Module mob) {
		super();
		this.pid = pid;
		this.pcode = pcode;
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pcode=" + pcode + ", mob=" + mob + "]";
	}
	
}
