package indi.kiki.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("indi/kiki/product/dao")

public class CypheemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CypheemallProductApplication.class, args);
    }

}
