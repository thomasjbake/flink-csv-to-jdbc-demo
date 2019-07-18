package com.demo.source;

import com.demo.util.FlinkEnvironment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.table.sources.CsvTableSource;
import org.apache.flink.types.Row;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Component
public class PropertyCSVSource {

    private final FlinkEnvironment flinkEnvironment;

    public DataSet<Row> read(String path) {
        log.info("Reading file {}", path);
        CsvTableSource csvTableSource = CsvTableSource
                .builder()
                .path(path)
                .field("parcelid", Types.INT)
                .field("airconditioningtypeid", Types.STRING)
                .field("architecturalstyletypeid", Types.STRING)
                .field("basementsqft", Types.STRING)
                .field("bathroomcnt", Types.STRING)
                .field("bedroomcnt", Types.STRING)
                .field("buildingclasstypeid", Types.STRING)
                .field("buildingqualitytypeid", Types.STRING)
                .field("calculatedbathnbr", Types.STRING)
                .field("decktypeid", Types.STRING)
                .field("finishedfloor1squarefeet", Types.STRING)
                .field("calculatedfinishedsquarefeet", Types.STRING)
                .field("finishedsquarefeet12", Types.STRING)
                .field("finishedsquarefeet13", Types.STRING)
                .field("finishedsquarefeet15", Types.STRING)
                .field("finishedsquarefeet50", Types.STRING)
                .field("finishedsquarefeet6", Types.STRING)
                .field("fips", Types.STRING)
                .field("fireplacecnt", Types.STRING)
                .field("fullbathcnt", Types.STRING)
                .field("garagecarcnt", Types.STRING)
                .field("garagetotalsqft", Types.STRING)
                .field("hashottuborspa", Types.STRING)
                .field("heatingorsystemtypeid", Types.STRING)
                .field("latitude", Types.STRING)
                .field("longitude", Types.STRING)
                .field("lotsizesquarefeet", Types.STRING)
                .field("poolcnt", Types.STRING)
                .field("poolsizesum", Types.STRING)
                .field("pooltypeid10", Types.STRING)
                .field("pooltypeid2", Types.STRING)
                .field("pooltypeid7", Types.STRING)
                .field("propertycountylandusecode", Types.STRING)
                .field("propertylandusetypeid", Types.STRING)
                .field("propertyzoningdesc", Types.STRING)
                .field("rawcensustractandblock", Types.STRING)
                .field("regionidcity", Types.STRING)
                .field("regionidcounty", Types.STRING)
                .field("regionidneighborhood", Types.STRING)
                .field("regionidzip", Types.STRING)
                .field("roomcnt", Types.STRING)
                .field("storytypeid", Types.STRING)
                .field("threequarterbathnbr", Types.STRING)
                .field("typeconstructiontypeid", Types.STRING)
                .field("unitcnt", Types.STRING)
                .field("yardbuildingsqft17", Types.STRING)
                .field("yardbuildingsqft26", Types.STRING)
                .field("yearbuilt", Types.STRING)
                .field("numberofstories", Types.STRING)
                .field("fireplaceflag", Types.STRING)
                .field("structuretaxvaluedollarcnt", Types.STRING)
                .field("taxvaluedollarcnt", Types.STRING)
                .field("assessmentyear", Types.STRING)
                .field("landtaxvaluedollarcnt", Types.STRING)
                .field("taxamount", Types.STRING)
                .field("taxdelinquencyflag", Types.STRING)
                .field("taxdelinquencyyear", Types.STRING)
                .field("censustractandblock", Types.STRING)
                .fieldDelimiter(",")
                .quoteCharacter('"')
                .lineDelimiter("\n")
                .ignoreFirstLine()
                .ignoreParseErrors()
                .build();
        log.info("Completed reading file {}", path);

        flinkEnvironment.getBatchTableEnvironment().registerTableSource("property", csvTableSource);
        return csvTableSource.getDataSet(flinkEnvironment.getExecutionEnvironment());
    }
}
