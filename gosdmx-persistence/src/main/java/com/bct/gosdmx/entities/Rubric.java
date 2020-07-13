package com.bct.gosdmx.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bct.gosdmx.enums.RubricsGroup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "T_GOSDMX_RUBRIC")
@Data
@EqualsAndHashCode(of = { "id", "label_fr", "label_en", "group" })
@NoArgsConstructor
@ToString
public class Rubric extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RUB_ID")
    private int id;

    @Column(name = "RUB_LABEL_FR", length = 500)
    private String label_fr;

    @Column(name = "RUB_LABEL_EN", length = 500)
    private String label_en;

    @Column(name = "RUB_GROUP", length = 500)
    @Enumerated(EnumType.STRING)
    private RubricsGroup group;

    @Column(name = "RUB_LINK_TO_SDMX", length = 500)
    private String linkToSDMXFile;

    @Column(name = "RUB_LINK_TO_METADATA", length = 500)
    private String linkToMetadataFile;

    @Column(name = "RUB_LINK_TO_INS", length = 500)
    private String linkToINSData;

}