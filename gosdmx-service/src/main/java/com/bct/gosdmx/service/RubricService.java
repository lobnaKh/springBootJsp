package com.bct.gosdmx.service;

import java.util.List;
import java.util.Map;

import com.bct.gosdmx.entities.Rubric;
import com.bct.gosdmx.enums.RubricsGroup;

public interface RubricService extends BaseService<Rubric, Integer> {

    Map<RubricsGroup, List<Rubric>> findGrouppedrubrics();

}
