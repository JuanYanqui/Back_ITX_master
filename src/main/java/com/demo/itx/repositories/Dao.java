package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

	Optional<T> findById(long id);

	List<T> findAll();

	T save(T t);

	void update(T t);

	void deleteById(long t);

}
