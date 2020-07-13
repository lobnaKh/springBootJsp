package com.bct.gosdmx.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, P extends Serializable> extends JpaRepository<T, P>, JpaSpecificationExecutor<T> {

	Optional<T> deleteById(Integer id);
}