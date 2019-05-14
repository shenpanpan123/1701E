package com.bawei.bean;

public class Stu {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Stu() {
		super();
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
