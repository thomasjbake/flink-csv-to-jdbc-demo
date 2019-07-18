package com.demo;

import com.demo.source.PropertyCSVSource;
import com.demo.repository.PropertyRepository;
import com.demo.sink.PropertyJDBCSink;
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

    private final PropertyCSVSource propertyCsvSource;
    private final PropertyJDBCSink propertyJdbcSink;
    private final PropertyRepository propertyRepository;

    public static void main(String[] args) {
        SpringApplication.run(FlinkCsvToJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String path = ResourceUtils.getURL("classpath:properties_2017_sample.csv").getPath();
        propertyJdbcSink.write(propertyCsvSource.read(path));
        log.info("Verified {} property records inserted into database", propertyRepository.count());
    }

}
