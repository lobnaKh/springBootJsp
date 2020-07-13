package com.bct.gosdmx.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bct.gosdmx.entities.Rubric;
import com.bct.gosdmx.enums.RubricsGroup;
import com.bct.gosdmx.service.RubricService;

@Service("rubricService")
public class RubricServiceImpl extends BaseServiceImpl<Rubric, Integer> implements RubricService {

    @Override
    public Map<RubricsGroup, List<Rubric>> findGrouppedrubrics() {
        List<Rubric> rubrics = findAll();
        Map<RubricsGroup, List<Rubric>> map = rubrics.stream().collect(Collectors.groupingBy(Rubric::getGroup));
        Map<RubricsGroup, List<Rubric>> treeMap = new TreeMap<RubricsGroup, List<Rubric>>(new Comparator<RubricsGroup>() {

            @Override
            public int compare(RubricsGroup o1, RubricsGroup o2) {
                return o1.getRank() - o2.getRank();
            }
        });
        treeMap.putAll(map);

        return treeMap;

    }

}
