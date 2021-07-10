package com.biancoteam.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
/**
 * 2021.07.10 bianco
 * 프로젝트 생성 후 처음으로 생성한 java파일
 * 앞으로 만들 클래스의 메인 클래스
 *
 * @SpringBootApplication 로 인해 스프링 부트의 자동설정, 스프링 bean읽기와 생성을 모두 자동으로 설정됨.
 * 때문에 항상 프로젝트의 최상단에 위치해야함.
 */
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
