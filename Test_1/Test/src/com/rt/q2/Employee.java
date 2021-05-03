package com.rt.q2;

public class Employee  implements Cloneable
	private int id;
	private String name;
	private Department dep;

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
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	@Override
	public String toString()
	{
		return(id+" id "+name+" name "+" Department "+dep);
	}
	
	public Employee(int id, String name, Department dep) {
	
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException
	{
		Employee temp = (Employee)super.clone();
		temp.setDep(getDep().clone());
		return temp;
	}	
	
}
