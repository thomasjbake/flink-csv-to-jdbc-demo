CREATE TABLE IF NOT EXISTS property (
    parcelid int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    airconditioningtypeid varchar(255),
    architecturalstyletypeid varchar(255),
    basementsqft varchar(255),
    bathroomcnt varchar(255),
    bedroomcnt varchar(255),
    buildingclasstypeid varchar(255),
    buildingqualitytypeid varchar(255),
    calculatedbathnbr varchar(255),
    decktypeid varchar(255),
    finishedfloor1squarefeet varchar(255),
    calculatedfinishedsquarefeet varchar(255),
    finishedsquarefeet12 varchar(255),
    finishedsquarefeet13 varchar(255),
    finishedsquarefeet15 varchar(255),
    finishedsquarefeet50 varchar(255),
    finishedsquarefeet6 varchar(255),
    fips char(5),
    fireplacecnt varchar(255),
    fullbathcnt varchar(255),
    garagecarcnt varchar(255),
    garagetotalsqft varchar(255),
    hashottuborspa varchar(255),
    heatingorsystemtypeid varchar(255),
    latitude varchar(255),
    longitude varchar(255),
    lotsizesquarefeet varchar(255),
    poolcnt varchar(255),
    poolsizesum varchar(255),
    pooltypeid10 varchar(255),
    pooltypeid2 varchar(255),
    pooltypeid7 varchar(255),
    propertycountylandusecode varchar(255),
    propertylandusetypeid varchar(255),
    propertyzoningdesc varchar(255),
    rawcensustractandblock varchar(255),
    regionidcity varchar(255),
    regionidcounty varchar(255),
    regionidneighborhood varchar(255),
    regionidzip varchar(255),
    roomcnt varchar(255),
    storytypeid varchar(255),
    threequarterbathnbr varchar(255),
    typeconstructiontypeid varchar(255),
    unitcnt varchar(255),
    yardbuildingsqft17 varchar(255),
    yardbuildingsqft26 varchar(255),
    yearbuilt varchar(255),
    numberofstories varchar(255),
    fireplaceflag varchar(255),
    structuretaxvaluedollarcnt varchar(255),
    taxvaluedollarcnt varchar(255),
    assessmentyear varchar(255),
    landtaxvaluedollarcnt varchar(255),
    taxamount varchar(255),
    taxdelinquencyflag varchar(255),
    taxdelinquencyyear varchar(255),
    censustractandblock varchar(255)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;