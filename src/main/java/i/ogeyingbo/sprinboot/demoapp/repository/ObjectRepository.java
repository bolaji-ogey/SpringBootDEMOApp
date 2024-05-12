/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package i.ogeyingbo.sprinboot.demoapp.repository;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */
public interface ObjectRepository<T> {

	public void store(T t);

	public T retrieve(int id);

	public T search(String name);

	public T delete(int id);
}
