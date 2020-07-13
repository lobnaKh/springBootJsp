package com.bct.gosdmx.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.bct.gosdmx.entities.Rubric;
import com.bct.gosdmx.enums.RubricsGroup;
import com.bct.gosdmx.service.RubricService;

import lombok.Data;

@ManagedBean("rubricBean")
@Scope("session")
@Data
public class RubricBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = LoggerFactory.getLogger(RubricBean.class);

    @Autowired
    private transient RubricService rubricService;

    private Map<RubricsGroup, List<Rubric>> rubrics;

    @PostConstruct
    private void init() {
        rubrics = rubricService.findGrouppedrubrics();
        LOGGER.info("List of groupped rubrics is rendered SUCCESSFULLY");
    }
}
