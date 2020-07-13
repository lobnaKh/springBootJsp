package com.bct.gosdmx.enums;

import lombok.Getter;

@Getter
public enum RubricsGroup {

    MACROECONMIC_AND_FINANCIAL_DATA("Données macroéconomiques et financières", "Macroeconomic and Financial Data", 1), DEMOGRAPHIC_AND_SOCIO_ECONOMIC_Indicators(
            "Indicateurs démographiques et socio-économiques", "Demographic and Socio-Economic Indicators", 2);

    private final String label_fr;
   
    private final String label_en;
    
    private final Integer rank;

    private RubricsGroup(String label_fr, String label_en, Integer rank) {
        this.label_fr = label_fr;
        this.label_en = label_en;
        this.rank = rank;
    }
}
