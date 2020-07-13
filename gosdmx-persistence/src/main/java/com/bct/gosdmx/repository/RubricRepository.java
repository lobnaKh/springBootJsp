package com.bct.gosdmx.repository;

import org.springframework.stereotype.Repository;

import com.bct.gosdmx.entities.Rubric;

@Repository("rubricRepository")
public interface RubricRepository extends BaseRepository<Rubric, Integer> {

}
