package com.hmj.portal.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;

@OpenAPIDefinition(info = @Info(title = "API Specification", description = "API 명세"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
	
	@Bean
    public GroupedOpenApi userInfo() {
        return GroupedOpenApi.builder()
                .group("회원정보")
                .pathsToMatch("/member/**")
                .build();
    }

    @Bean
    public GroupedOpenApi productInfo() {
        return GroupedOpenApi.builder()
                .group("상품정보")
                .pathsToMatch("/product/**")
                .build();
    }
    
}