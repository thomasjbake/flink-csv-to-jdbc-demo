# Flink CSV to JDBC Table API Demo
Demonstration of [Apache Flink's](https://ci.apache.org/projects/flink/flink-docs-release-1.8/) [Table API](https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/table/) and [DataSet API](https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/batch/) for CSV to JDBC operations.<br>
<br>
CSV data sourced from the [Zillow ZEstimate Kaggle Competition](https://www.kaggle.com/c/zillow-prize-1/data).<br>

## Key Classes
* [FlinkCsvToJdbcDemoApplication.java](/src/main/java/com/demo/FlinkCsvToJdbcDemoApplication.java)<br>
Entry point for application.<br>
* [PropertyCSVSource.java](/src/main/java/com/demo/source/PropertyCSVSource.java)<br>
Table API [CSVTableSource](https://ci.apache.org/projects/flink/flink-docs-release-1.3/api/java/org/apache/flink/table/sources/CsvTableSource.html) Wrapper for reading CSV files. Converts [properties_2017_sample.csv](/src/main/resources/properties_2017_sample.csv) into a DataSet<br>
* [PropertyJDBCSink.java](/src/main/java/com/demo/sink/PropertyJDBCSink.java)<br>
JDBC Sink for writing to a JDBC location. In our case an in-memory H2 database for testing.<br>

## Usage
```bash
mvn spring-boot:run
```

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments
[The Zillow Group](https://www.zillowgroup.com/) for providing the sample data<br>
Boaz Brudner and Ahmed Atif for the inspiration to create this project.
