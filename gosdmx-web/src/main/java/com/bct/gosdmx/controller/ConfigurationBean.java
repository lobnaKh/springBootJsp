package com.bct.gosdmx.controller;

import java.io.Serializable;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Scope;

import lombok.Data;

@ManagedBean(value = "configurationBean")
@Scope("request")
@Data
public class ConfigurationBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private transient BuildProperties buildProperties;

}