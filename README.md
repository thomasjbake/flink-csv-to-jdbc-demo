# Flink CSV to JDBC Table API Demo
Demonstration of Flink's Table API for CSV to JDBC operations<br>
[Flink Table API](https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/table/)<br>
[Flink Batch DataSet API](https://ci.apache.org/projects/flink/flink-docs-release-1.8/dev/batch/)<br>
[properties_2017_sample.csv](/src/main/resources/properties_2017_sample.csv) data sourced from the [Zillow ZEstimate Kaggle Competition](https://www.kaggle.com/c/zillow-prize-1/data)<br>

## Key Classes
[FlinkCsvToJdbcDemoApplication.java](/src/main/java/com/demo/FlinkCsvToJdbcDemoApplication.java)<br>
Entry point for application.<br>
[CSVSource.java](/src/main/java/com/demo/reader/CSVSource.java)<br>
CSV Table Source for reading CSV files. Converts the [properties_2017_sample.csv](/src/main/resources/properties_2017_sample.csv) file in the resources directory into a DataSet<br>
[JDBCSink.java](/src/main/java/com/demo/writer/JDBCSink.java)<br>
JDBC Sink for writing to a JDBC location. In our case an in-memory H2 database for testing.<br>

## Usage
```bash
mvn spring-boot:run
```

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
