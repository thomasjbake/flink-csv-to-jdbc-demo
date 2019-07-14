package com.demo;

import com.demo.reader.CSVSource;
import com.demo.repository.PropertyRepository;
import com.demo.writer.JDBCSink;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class FlinkCsvToJdbcDemoApplication implements CommandLineRunner {

    private final CSVSource csvSource;
    private final JDBCSink jdbcSink;
    private final PropertyRepository propertyRepository;

    public static void main(String[] args) {
        SpringApplication.run(FlinkCsvToJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String path = ResourceUtils.getURL("classpath:properties_2017_sample.csv").getPath();
        jdbcSink.write(csvSource.read(path));
        log.info("Verified {} property records inserted into database", propertyRepository.count());
    }

}
