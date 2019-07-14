package com.demo.util;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.table.api.java.BatchTableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class FlinkEnvironment {
    private ExecutionEnvironment executionEnvironment = ExecutionEnvironment.getExecutionEnvironment();
    private BatchTableEnvironment batchTableEnvironment = BatchTableEnvironment.create(executionEnvironment);

    public ExecutionEnvironment getExecutionEnvironment() {
        return executionEnvironment;
    }

    public BatchTableEnvironment getBatchTableEnvironment() {
        return batchTableEnvironment;
    }
}
