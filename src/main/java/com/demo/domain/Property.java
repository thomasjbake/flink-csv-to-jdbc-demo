package com.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Property {
    @Id
    private Integer parcelid;
    private String airconditioningtypeid;
    private String architecturalstyletypeid;
    private String basementsqft;
    private String bathroomcnt;
    private String bedroomcnt;
    private String buildingclasstypeid;
    private String buildingqualitytypeid;
    private String calculatedbathnbr;
    private String decktypeid;
    private String finishedfloor1squarefeet;
    private String calculatedfinishedsquarefeet;
    private String finishedsquarefeet12;
    private String finishedsquarefeet13;
    private String finishedsquarefeet15;
    private String finishedsquarefeet50;
    private String finishedsquarefeet6;
    private String fips;
    private String fireplacecnt;
    private String fullbathcnt;
    private String garagecarcnt;
    private String garagetotalsqft;
    private String hashottuborspa;
    private String heatingorsystemtypeid;
    private String latitude;
    private String longitude;
    private String lotsizesquarefeet;
    private String poolcnt;
    private String poolsizesum;
    private String pooltypeid10;
    private String pooltypeid2;
    private String pooltypeid7;
    private String propertycountylandusecode;
    private String propertylandusetypeid;
    private String propertyzoningdesc;
    private String rawcensustractandblock;
    private String regionidcity;
    private String regionidcounty;
    private String regionidneighborhood;
    private String regionidzip;
    private String roomcnt;
    private String storytypeid;
    private String threequarterbathnbr;
    private String typeconstructiontypeid;
    private String unitcnt;
    private String yardbuildingsqft17;
    private String yardbuildingsqft26;
    private String yearbuilt;
    private String numberofstories;
    private String fireplaceflag;
    private String structuretaxvaluedollarcnt;
    private String taxvaluedollarcnt;
    private String assessmentyear;
    private String landtaxvaluedollarcnt;
    private String taxamount;
    private String taxdelinquencyflag;
    private String taxdelinquencyyear;
    private String censustractandblock;
}
