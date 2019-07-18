package com.demo.sink;

import com.demo.util.FlinkEnvironment;
import com.demo.util.JDBCOutputFormatBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.types.Row;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Component
public class PropertyJDBCSink {

    private final FlinkEnvironment flinkEnvironment;
    private final JDBCOutputFormatBuilder jdbcOutputFormatBuilder;

    public void write(DataSet<Row> dataSet) throws Exception {
        long recordCount = dataSet.count();
        log.info("Inserting {} records into property table", recordCount);
        dataSet.output(jdbcOutputFormatBuilder.buildJDBCOutputFormat("INSERT INTO property " +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"));

        flinkEnvironment.getExecutionEnvironment().execute("flink-csv-to-jdbc-table-api-demo");
        log.info("Completed writing {} records into property table", recordCount);
    }
}
