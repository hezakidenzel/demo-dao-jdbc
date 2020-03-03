package model.Dao;

import java.util.List;

import model.entidade.Department;

public interface Departament {
	
	void insert (Department obj);
	void update (Department obj);
	void deleteById(Integer ind);
	Department findById(Integer id);
	List<Department> findAll();

}
