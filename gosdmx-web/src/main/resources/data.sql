/*==============================================================*/
/*Insert into T_GOSDMX_RUBRIX                                            */
/*==============================================================*/
INSERT INTO T_GOSDMX_RUBRIC (RUB_LABEL_FR, RUB_LABEL_EN, RUB_GROUP, RUB_LINK_TO_SDMX, RUB_LINK_TO_METADATA, RUB_LINK_TO_INS,
CREATION_DATE)
       select 'Comptes Nationaux', 'National Accounts', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Indice de production', 'Production index', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Marché du Travail', 'Labour market', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Salaires et Gains', 'Wages and Earnings', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Indices de Prix', 'Price Indices', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Opérations du secteur public', 'Public Sector Operations', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Opérations de l''administration centrale', 'Central Government Operations', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Encours Dette Publique:Administration Centrale', 'Central Government Debt', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Comptes analytiques du secteur bancaire', 'Analytical accounts of the Banking Sector','MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Comptes analytiques de la Banque Centrale', 'Analytical accounts of the Central Bank', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Taux d''intérêt', 'Interest rates', 'MACROECONMIC_AND_FINANCIAL_DATA','https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Indices boursiers', 'Stock Exchange Index', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Balance des paiements', 'Balance of payments', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Réserves internationales et liquidités en devises étrangères', 'International Reserves and Foreign currency liquidity', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Commerce extérieur', 'Merchandise trade', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Position extérieure globale', 'International Investment Position','MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Taux de change', 'Exchange rates', 'MACROECONMIC_AND_FINANCIAL_DATA','https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Position de la dette extérieure brute', 'Gross external debt position', 'MACROECONMIC_AND_FINANCIAL_DATA', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual
       union all select 'Population', 'Population', 'DEMOGRAPHIC_AND_SOCIO_ECONOMIC_Indicators', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', 'https://www.bct.gov.tn/', SYSDATE from dual;       
      
       