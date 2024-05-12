/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i.ogeyingbo.springbooy.demoapp.data.model;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */
public class Employee {

	private int id;
	private String name;
	private String jobTitle;

	public Employee() {
	}

	public Employee(int i, String n, String jt) {
		this.id = i;
		this.name = n;
		this.jobTitle = jt;
	}

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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return id + "," + name + "," + jobTitle;
	}
}