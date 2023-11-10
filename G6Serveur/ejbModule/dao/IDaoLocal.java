package dao;

import java.util.List;



@Local
public interface IDaoLocal<T> {
	T create(T o);
	T delete(T o);
	T update(T o);
	T findById(int id);
	List<T> findAll();
}