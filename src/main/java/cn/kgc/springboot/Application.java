package cn.kgc.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   springboot项目的启动类
 */
@SpringBootApplication(scanBasePackages = "cn.kgc.springboot.*")
@MapperScan("cn.kgc.springboot.mapper")  //扫描到mapper接口
public class Application {

    //项目的启动方法
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
