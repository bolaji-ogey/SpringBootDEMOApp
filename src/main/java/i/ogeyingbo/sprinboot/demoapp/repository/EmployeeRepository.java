/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i.ogeyingbo.sprinboot.demoapp.repository;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import  i.ogeyingbo.springbooy.demoapp.data.model.Employee;

@Repository
public class EmployeeRepository implements ObjectRepository<Employee> {

	private Map<Integer, Employee> repository;

	public EmployeeRepository() {
		this.repository = new HashMap<>();
	}

	@Override
	public void store(Employee emp) {
		repository.put(emp.getId(), emp);
	}

	@Override
	public Employee retrieve(int id) {
		return repository.get(id);
	}

	@Override
	public Employee search(String name) {
		Collection<Employee> emps = repository.values();
		for (Employee emp : emps) {
			if (emp.getName().equalsIgnoreCase(name))
				return emp;
		}
		return null;
	}

	@Override
	public Employee delete(int id) {
		Employee e = repository.get(id);
		this.repository.remove(id);
		return e;
	}
        
        

}
